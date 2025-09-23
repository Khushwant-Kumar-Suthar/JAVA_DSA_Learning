package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;

import java.util.concurrent.CyclicBarrier;

class ParallelSumWorker implements Runnable {
    private final int[] arr;
    private final int start;
    private final int end;
    private final CyclicBarrier barrier;
    private final int[] results;
    private final int index;

    public ParallelSumWorker(int[] arr, int start, int end, CyclicBarrier barrier, int[] results, int index) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.barrier = barrier;
        this.results = results;
        this.index = index;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        results[index] = sum; // Store result in shared array
        System.out.println(Thread.currentThread().getName() + " computed partial sum: " + sum);
        try {
            barrier.await(); // Wait for all threads
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ParallelSum {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Fill with values 1 to 1000
        }

        int numThreads = 4;
        int chunkSize = arr.length / numThreads;
        int[] results = new int[numThreads]; // Store partial sums

        CyclicBarrier barrier = new CyclicBarrier(numThreads, () -> {
            // This runs after all threads finish their work
            int totalSum = 0;
            for (int sum : results) {
                totalSum += sum;
            }
            System.out.println("Final Sum: " + totalSum);
        });

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? arr.length : (start + chunkSize);
            new Thread(new ParallelSumWorker(arr, start, end, barrier, results, i)).start();
        }
    }
}


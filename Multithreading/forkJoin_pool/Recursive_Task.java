package JAVA_DSA_Learning.Multithreading.forkJoin_pool;
import java.util.concurrent.*;
class SumTask extends RecursiveTask<Integer> {
    private int[] arr;
    private int start, end;
    private static final int THRESHOLD = 3; // base case

    SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    // splits large problems into smaller ones(recursive divide and conquer
    // Efficient execution using fork() and join()
    // uses cpu cores optimally
    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            int sum = 0;
            for (int i = start; i < end; i++) sum += arr[i];
            return sum;
        }

        int mid = (start + end) / 2;
        SumTask leftTask = new SumTask(arr, start, mid);
        SumTask rightTask = new SumTask(arr, mid, end);

        leftTask.fork();  // Asynchronous execution
        int rightResult = rightTask.compute();  // process right side is current thread
        int leftResult = leftTask.join();  // wait for left side result
        return leftResult + rightResult;
    }
}
public class Recursive_Task {
    public static void main(String[] args){
        int [] num = {1,2,3,4,5,6,7,8,9};
        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(num,0,num.length);

        int result = pool.invoke(task);
        System.out.println("Sum: "+result);  // output sum 45
        pool.shutdown();
    }
}

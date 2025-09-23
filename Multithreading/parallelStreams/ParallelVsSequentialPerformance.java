package JAVA_DSA_Learning.Multithreading.parallelStreams;

import java.util.stream.IntStream;

public class ParallelVsSequentialPerformance {
    public static void main(String[] args){
        long start , end;

        // sequential execution
        start = System.currentTimeMillis();
        long sum1 = IntStream.rangeClosed(1,1_000_000).sum();
        end = System.currentTimeMillis();
        System.out.println("Sequential Time: "+(end-start)+"ms");

        // parallel execution
        start = System.currentTimeMillis();
        long sum2 = IntStream.rangeClosed(1,1_000_000).parallel().sum();
        end = System.currentTimeMillis();
        System.out.println("Parallel Time: "+(end-start)+"ms");
    }
}

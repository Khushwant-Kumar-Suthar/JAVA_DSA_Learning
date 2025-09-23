package JAVA_DSA_Learning.Multithreading.parallelStreams;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
// Controls the number of parallel threads
// useful for performance tuning
public class CustomForkJoinPool {
    public static void main(String[] args){
        ForkJoinPool customPool = new ForkJoinPool(2); //limit to 2 threads

        customPool.submit(()->
                IntStream.range(1,11)
                        .parallel()
                        .forEach(i-> System.out.println(Thread.currentThread().getName()+" - "+i))
        ).join();
        customPool.shutdown();
    }
}

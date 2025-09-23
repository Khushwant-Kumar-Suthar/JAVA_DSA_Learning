package JAVA_DSA_Learning.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncCustomThreadPool {
    public static void main(String[] args){
        // usee custom thread pool
        // Avoids overloading Common pool
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
            System.out.println(Thread.currentThread().getName()+" running task.....");
        },executor);
        future.join();
        executor.shutdown();

    }
}

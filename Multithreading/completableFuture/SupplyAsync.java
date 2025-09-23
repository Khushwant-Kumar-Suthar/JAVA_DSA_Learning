package JAVA_DSA_Learning.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class SupplyAsync {
    public static void main(String[] args){

        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            return "Hello from "+Thread.currentThread().getName();
        });
        System.out.println(future.join()); // get result
        // Runs asynchronously
        // return a value String
    }
}

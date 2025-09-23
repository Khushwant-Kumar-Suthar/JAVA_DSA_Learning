package JAVA_DSA_Learning.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class RunningParallel {
    public static void main(String[] agrs){
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->"Task 1");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"Task 2");

        // wait for both to finish
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1,future2);
        allFutures.join();
        System.out.println("All tasks completed");
        // get the first completed result
        CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(future1,future2);
        // returns a task as soon as completes
        System.out.println("First Completed: "+anyFuture.join());

    }
}

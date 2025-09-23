package JAVA_DSA_Learning.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenApply {
    public static void main(String[] args){
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->"Hello").thenApply(result->result+" World");
        System.out.println(future.join()); // output: Hello World
        //  Transforms result step by step
        // thread execution is still async
    }
}

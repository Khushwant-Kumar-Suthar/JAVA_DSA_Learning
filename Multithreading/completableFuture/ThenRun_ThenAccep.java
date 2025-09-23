package JAVA_DSA_Learning.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenRun_ThenAccep {
    public static void main(String[] args){
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(()->"Data Processed")
                .thenAccept(result-> System.out.println("Received: "+result)); //Uses result
        // return nothing
        // use thenRun when the result is not needed
        future = CompletableFuture.supplyAsync(()->"Task Done")
                .thenRun(()-> System.out.println("No result needed, just running another task!"));
    }
}

package JAVA_DSA_Learning.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class HandlingExceptions {
    public static void main(String[] args) {
        System.out.println("Handles only failure:");
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            if (true) throw new RuntimeException("Error occurred!");
            return 10;
        }).exceptionally(ex -> {
            System.out.println("Handled exception: " + ex.getMessage());
            return 0; //default value
        });
        System.out.println("Result: " + future.join());

        // handle() -> Handles both success and failure
        System.out.println("Handle both success & failure ");
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            if (true) throw new RuntimeException("Something went wrong!");
            return 10;
        }).handle((result, ex) -> {
            if (ex != null) {
                System.out.println("Error: " + ex.getMessage());
                return 0;
            }
            return result;
        });
        System.out.println("Result: " + future1.join()); // output 0
    }
}

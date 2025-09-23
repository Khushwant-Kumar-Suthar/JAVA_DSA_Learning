package JAVA_DSA_Learning.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CombiningTwoFuture {
    public static void main(String[] args){
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->"Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->"World");
         // here we create s1 and s2 then use Lambda expression
        CompletableFuture<String> result = future1.thenCombine(future2,(s1,s2)->s1+s2);
        System.out.println(result.join());
    }
}

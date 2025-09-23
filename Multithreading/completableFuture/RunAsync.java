package JAVA_DSA_Learning.Multithreading.completableFuture;
// runAsync() method use when the task return void
import java.util.concurrent.*;
public class RunAsync {
    public static void main(String[] args){
        CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
            System.out.println(Thread.currentThread().getName()+" is running");
        });

        future.join(); // wait for completion (Alternative to future.get())
        // Runs on a separate thread
        // Doesn't return any result (void)
        // join() is a non blocking alternative to get()
    }
}

package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;
import java.util.concurrent.Semaphore;
class SharedResourceData {
    private final Semaphore semaphore = new Semaphore(2); // Allow max 3 threads at a time

    void accessResource(String name) {
        try {
            semaphore.acquire(); // Acquire a permit
            System.out.println(name + " acquired a permit and is accessing the resource...");
            Thread.sleep(2000); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(name + " is releasing the permit.");
            semaphore.release(); // Release the permit
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args){
        SharedResourceData resource = new SharedResourceData();
        for (int i = 1;i<=5;i++){
            String name = "Thread-"+i;
            new Thread(()->resource.accessResource(name)).start();
        }
    }
}

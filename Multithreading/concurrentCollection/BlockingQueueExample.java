package JAVA_DSA_Learning.Multithreading.concurrentCollection;
import java.util.concurrent.ArrayBlockingQueue;
public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException{
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2); // how many store in queue
        queue.put(1);
        queue.put(2);
        System.out.println(queue.take()); // retrieves and removes head


    }
}

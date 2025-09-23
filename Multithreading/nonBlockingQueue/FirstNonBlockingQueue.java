package JAVA_DSA_Learning.Multithreading.nonBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
public class FirstNonBlockingQueue {
    public static void main(String[] args){
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        // Producer thread
        new Thread(()->{
           queue.add(10);
           queue.add(20);
           queue.add(30);
        }).start();
        // consumer thread
        new Thread(()->{
            while (!queue.isEmpty()){
                System.out.println("Removed: "+queue.poll());
            }
        }).start();
    }
}

package JAVA_DSA_Learning.Multithreading.nonBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class SecondNonBlockingQueue {
    public static void main(String[] args){
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        // adding element at both end
        deque.addFirst("Khushwant");
        deque.addLast("Amrit");

        System.out.println("Removing: "+deque.pollFirst());
        System.out.println("Removing: "+deque.pollLast());

    }
}

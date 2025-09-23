package JAVA_DSA_Learning.Multithreading.concurrentCollection;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(10);
        queue.add(20);
        System.out.println(queue.poll());// retrieves and head 10
        System.out.println(queue.peek());
    }
}

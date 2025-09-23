package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class SharedData {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean dataAvailable = false;

    void produce() {
        lock.lock();
        try {
            System.out.println("Producing data...");
            dataAvailable = true;
            condition.signal(); // Notify waiting threads
        } finally {
            lock.unlock();
        }
    }

    void consume() {
        lock.lock();
        try {
            while (!dataAvailable) {
                condition.await(); // Wait for signal
            }
            System.out.println("Consuming data...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class ConditionalVariables {
    public static void main(String[] args) {
        SharedData resource = new SharedData();

        // Creating multiple threads
        Runnable task = resource::produce;
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
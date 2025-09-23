package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;

import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final ReentrantLock lock = new ReentrantLock();

    void accessResource() {
        lock.lock(); // Acquire the lock
        try {
            System.out.println(Thread.currentThread().getName() + " is accessing the resource...");
            Thread.sleep(1000); // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // Release the lock
        }
    }
}

public class  LockAndReentralLock {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Creating multiple threads
        Runnable task = resource::accessResource;
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}



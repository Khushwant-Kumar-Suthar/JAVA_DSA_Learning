package JAVA_DSA_Learning.Multithreading.Starvation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final Lock lock = new ReentrantLock(true); // Fair lock

    void access() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " accessed the resource.");
        } finally {
            lock.unlock();
        }
    }
}

public class SolutionByFairLock {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
     // method reference
        // Runnable task = resource::access;
         Runnable task = ()->{
                              resource.access();
         };
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}



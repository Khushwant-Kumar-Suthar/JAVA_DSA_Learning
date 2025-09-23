package JAVA_DSA_Learning.Multithreading.LiveLock;

class Worker {
    private boolean active = true;

    public synchronized void work(Worker other) {
        while (active) {
            System.out.println(Thread.currentThread().getName() + " is working...");
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            if (!other.isActive()) {
                System.out.println(Thread.currentThread().getName() + " stops waiting and continues.");
                return;
            }

            System.out.println(Thread.currentThread().getName() + " gives up and lets " + other + " proceed.");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }

    public boolean isActive() {
        return active;
    }

    public void deactivate() {
        active = false;
    }
}

public class LiveLockExample {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();

        Thread t1 = new Thread(() -> worker1.work(worker2), "Worker-1");
        Thread t2 = new Thread(() -> worker2.work(worker1), "Worker-2");

        t1.start();
        t2.start();
    }
}

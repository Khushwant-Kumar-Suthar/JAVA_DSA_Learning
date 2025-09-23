package JAVA_DSA_Learning.Multithreading.LiveLock;

import java.util.Random;

class Workers {
    private boolean active = true;
    private final Random random = new Random();

    public synchronized void work(Workers other) {
        while (active) {
            System.out.println(Thread.currentThread().getName() + " is working...");
            try { Thread.sleep(random.nextInt(200)); } catch (InterruptedException e) {}

            if (!other.isActive()) {
                System.out.println(Thread.currentThread().getName() + " stops waiting and continues.");
                return;
            }

            System.out.println(Thread.currentThread().getName() + " gives up and lets " + other + " proceed.");
            try { Thread.sleep(random.nextInt(200)); } catch (InterruptedException e) {}
        }
    }

    public boolean isActive() {
        return active;
    }

    public void deactivate() {
        active = false;
    }
}

public class FixedLivelockExample {
    public static void main(String[] args) {
        Workers worker1 = new Workers();
        Workers worker2 = new Workers();
        Thread t1 = new Thread(() -> worker1.work(worker2), "Worker-1");
        Thread t2 = new Thread(() -> worker2.work(worker1), "Worker-2");

        t1.start();
        t2.start();
    }
}


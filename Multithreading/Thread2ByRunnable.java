package JAVA_DSA_Learning.Multithreading;

class Tester implements Runnable {
    private int currentValue;

    public Tester() {
        currentValue = 0;
    }

    public int getValue() {
        return currentValue;
    }

    public void run() {
        System.out.println("Enter in Thread ---> ");
        try {
            while (currentValue < 5) {
                System.out.println(Thread.currentThread().getName() + " : " + (currentValue++));
                Thread.sleep(250);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " Interrupted ");
        }
        System.out.println("Exit from thread : " + Thread.currentThread().getName());
    }
}

public class Thread2ByRunnable {
    public static void main(String[] args) {
        Tester testerA = new Tester();

        Thread t = new Thread(testerA, "TesterA");
        System.out.println(t);
        t.start(); // this is run by set threadName 
        // testerA.run(); // this is run by main() thread name
        try {
            int val;
            do {
                val = testerA.getValue();
                System.out.println("Tester value read from " + Thread.currentThread().getName() + " : " + val);
                Thread.sleep(500);
            } while (val < 5);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " Interrupted");
        }
        System.out.println("Exit from main() thread");
    }
}

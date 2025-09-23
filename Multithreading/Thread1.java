package JAVA_DSA_Learning.Multithreading;

class Counter extends Thread {
    private int currentValue;

    public Counter(String threadName) {
        // super is use for set threadname in thread class
        super(threadName); // initialize thread
        currentValue = 0;
        System.out.println(this);
        // setDaemon(true);   // illustrates the daemon nature of thread // its a low priority thread
        start(); // start the thread
    }

    public int getValue() {
        return currentValue;
    }

    // getName() is inbuilt method to get thread name
    // setName() is inbuilt method to set thread name
    public void run() { // override from super class Thread
        try {
            while (currentValue < 5) {
                System.out.println(getName() + ": " + (currentValue++));
                Thread.sleep(350); // current thread sleeps
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted ");
        }
        System.out.println("Exit from thread: " + getName());
    }
}

public class Thread1 {
    public static void main(String[] args) {
        System.out.println("Method main() runs in thread " + Thread.currentThread().getName());
        Counter counterA = new Counter("counterA"); // thread create
        Counter counterB = new Counter("counterB"); // thread create
//        counterA.start();
//        counterB.start();
        System.out.println("Exit from main() method: ");

    }
}

package JAVA_DSA_Learning.Multithreading;

class Resturent extends Thread {
    int currentOrderValue = 0;

    public Resturent(String threadName) {
        super(threadName);
        System.out.println(this);
        start();
    }

    public void run() {
        // try{
        while (currentOrderValue < 10) {
            System.out.println(getName() + " is placed " + (currentOrderValue++));
            //Thread.sleep(250);
        } // when we use sleep method then we should handled interrupt exception so error not occure
//        } catch (InterruptedException e){
//            System.out.println(e);
//        }
        System.out.println(getName() + " is delivered");
    }

}

public class Thread3 {
    public static void main(String[] args) {
        Resturent Order1 = new Resturent("Order From amit");
       
        Order1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("ID of Order1 is " + Order1.threadId());
        System.out.println("Order priority number is " + Order1.getPriority());
        System.out.println("Status of order is " + Order1.getState());
        System.out.println("Order Group " + Order1.getThreadGroup());

        Order1.setName("Amit Order");
    }
}

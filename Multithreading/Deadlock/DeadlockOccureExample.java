package JAVA_DSA_Learning.Multithreading.Deadlock;
class SharedDate{
    void methodA(SharedDate s) {
        synchronized (this) { // acquiring lock on this
            System.out.println(Thread.currentThread().getName() + " Locked " + this);
            try{ Thread.sleep(1000); } catch (InterruptedException e){}
            synchronized (s){// trying to acquire lock on s object
                System.out.println(Thread.currentThread().getName()+" Locked "+s);
            }
        }
    }
}
public class DeadlockOccureExample {
    public static void main(String[] args){
        SharedDate s1 = new SharedDate();
        SharedDate s2 = new SharedDate();

        Thread t1 = new Thread(()->s1.methodA(s2),"Thread-1");
        Thread t2 = new Thread(()->s2.methodA(s1),"Thread-2");
       t1.start();
       t2.start();


    }
}

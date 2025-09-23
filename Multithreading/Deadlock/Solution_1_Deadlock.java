package JAVA_DSA_Learning.Multithreading.Deadlock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedDataLock{
    private final Lock  lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    void process(){
        while (true){
            if(lock1.tryLock()){
                try{
                    if(lock2.tryLock()){
                        try {
                            System.out.println(Thread.currentThread().getName()+" Both are lock");
                            break;
                        }
                        finally {
                            lock2.unlock();
                        }
                    }
                }
                finally {
                    lock1.unlock();
                }
            }
        }
    }
}
public class Solution_1_Deadlock {
    public static void main(String[] args){
      SharedDataLock s = new SharedDataLock();

        Thread t1 = new Thread(s::process,"Thread-1");
        Thread t2 = new Thread(s::process,"Thread-2");
        t1.start();
        t2.start();


    }
}

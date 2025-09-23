package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class Shared{
    private int data = 0;
    private final ReentrantReadWriteLock lock  = new ReentrantReadWriteLock();
    // read mehtod
    void read(){
        lock.readLock().lock(); // acquire read lock
        try{
            System.out.println(Thread.currentThread().getName()+" is reading: "+data);
            Thread.sleep(500); // time wait for read operation
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.readLock().unlock(); // release lock
        }
    }
    void write(int value){
        // acquire write lock
        lock.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName()+" is writing "+value);
            Thread.sleep(1000); // sleep for write operation
            data = value;
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            lock.writeLock().unlock(); // lock release
        }
    }
}
public class ReadWriteLockExample {
    public static void main(String[] args){
        Shared sh = new Shared();
        // create runnable task
        Runnable readTask = sh::read;
        // create multiple reader thread
        Thread reader1 = new Thread(readTask,"Reader-1");
        Thread reader2 = new Thread(readTask,"Reader-2");
        Thread reader3 = new Thread(readTask,"Reader-3");

        Runnable writeTask = ()->sh.write(116);
        Thread writer = new Thread(writeTask,"Writer");

        reader1.start();
        reader2.start();
        writer.start();
        reader3.start();



    }
}

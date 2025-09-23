package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
class SHaredQueue{
    private int data = 0;
    private boolean hasData = false;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    // producer methode
    public void produce(int data){
        lock.lock();
        try{ // here hasData = true then while loop enter
            while (hasData){
                condition.await(); // wait if data is already produced
            }
            this.data = data;
            hasData = true;
            System.out.println("Produced "+data);
            condition.signal(); // notify consumer for run
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    // consumer method
    public void consume(){
        lock.lock();
        try{
            while (!hasData){
                condition.await(); // wait if no data available
            }
            System.out.println("Consumer: "+data);
            hasData =false; // false means consumer done and now free way
            condition.signal(); // notify producer
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
public class ConditionVariableExample {
    public static void main(String[] args){
        SHaredQueue sq = new SHaredQueue();
        // Producer thread
        Thread producer =  new Thread(()->{
            for (int i = 1;i<=5;i++){
                sq.produce(i);
            }
        });

        // consumer thread
        Thread consumer = new Thread(()->{
            for (int i = 1;i<=5;i++){
                sq.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}

package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
class Worker implements Runnable{
    private final CyclicBarrier barrier;
    private final int id;
    public Worker(CyclicBarrier barrier , int id ){
        this.barrier = barrier;
        this.id = id;
    }
    public void run(){
        try{
            System.out.println("Worker "+id+" is doing work.....");
            Thread.sleep(2000);
            System.out.println("Worker "+id+" reached the barrier.");
            barrier.await();
            System.out.println("Worker "+id+" Proceeds after the barrier..");
        }catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
public class CyclicBarrierExample {
    public static void main(String[] args){
        final int WORKERS = 3;
        CyclicBarrier barrier = new CyclicBarrier(WORKERS,()->{
            System.out.println("All workers reached the barrier proceeding.....");
        });
        for (int i = 1;i<=WORKERS;i++){
            new Thread(new Worker(barrier,i)).start();
        }
    }
}

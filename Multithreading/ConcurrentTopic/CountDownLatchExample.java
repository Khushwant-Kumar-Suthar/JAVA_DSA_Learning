package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;
import java.util.concurrent.CountDownLatch;
public class CountDownLatchExample {
    public static void main(String [] args){
        int taskCount = 3;
        CountDownLatch latch = new CountDownLatch(taskCount);
        // createing wroker thread
        for(int i = 1;i<=taskCount;i++){
            new Thread(new Workers(latch," Task- "+i)).start();
        }
        try{
            System.out.println("Main thread waiting for task to complete.....");
            latch.await();
            System.out.println("All task completed. Main thread resumes");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class Workers implements Runnable{
    private CountDownLatch latch;
    private String taskName;
    public Workers(CountDownLatch latch,String taskName){
        this.latch = latch;
        this.taskName = taskName;
    }
    public void run(){
        try{
            System.out.println(taskName+" is executing....");
            Thread.sleep((long) (Math.random()*3000));
            System.out.println(taskName+" is done..");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            latch.countDown(); // decrease the count
        }
    }
}

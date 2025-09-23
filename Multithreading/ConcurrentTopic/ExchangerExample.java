package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;
import java.util.concurrent.Exchanger;

class DataExchanger implements  Runnable{
    private Exchanger<String > exchanger;
    private String data;
    public DataExchanger (Exchanger<String> exchanger, String data){
        this.exchanger = exchanger;
        this.data = data;
    }
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" has data "+data);
            data = exchanger.exchange(data); //exchanging data
            System.out.println(Thread.currentThread().getName()+" received "+data);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class ExchangerExample {
    public static void main(String [] args){
        Exchanger<String> exchanger = new Exchanger<>();
        Thread t1 = new Thread(new DataExchanger(exchanger,"Message from T1"));
        Thread t2 = new Thread(new DataExchanger(exchanger,"Message from T2"));
        t1.start();
        t2.start();

    }
}

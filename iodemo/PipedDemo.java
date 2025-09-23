package JAVA_DSA_Learning.iodemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream o){
        os = o;
    }
    public void run(){
        int count = 1;
        while (true){
            try{
                os.write(count);
                os.flush();
                System.out.println("Producer: "+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            } catch (Exception e){}
        }
    }
}
class Consumer extends Thread{
    InputStream io;
    public Consumer(InputStream i){
        io = i;
    }
    public void run(){
        while (true){
            try{
                int x ;
                     x = io.read();
                System.out.println("Consumer: "+x);
                System.out.flush();
                Thread.sleep(10);

            } catch (Exception e){}
        }
    }

}
public class PipedDemo {
    public static  void main(String[] args) throws Exception{
        // using piped stream thread communication
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        // connect both the piped
        pis.connect(pos);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();
        c.start();



    }
}

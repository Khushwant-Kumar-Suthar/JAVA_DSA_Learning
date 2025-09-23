package JAVA_DSA_Learning.Multithreading;
class MyThread extends Thread{
    public MyThread(String threadName ){
        super(threadName);

        System.out.println("Constructor is running and  for "+Thread.currentThread().getName());
       //start();
    }

    public void run(){
        System.out.println("Thread is running "+Thread.currentThread().getName());
    }
}
public class ExecutionOfThread {
    public static void main(String[] args){
       MyThread threadA = new MyThread("Thread A");
        MyThread threadB = new MyThread("Thread B");

        threadA.start();
        threadB.start();
    }
}

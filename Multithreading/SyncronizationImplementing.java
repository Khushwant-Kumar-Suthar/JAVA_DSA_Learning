package JAVA_DSA_Learning.Multithreading;

class MyData{
    // we can synchronize method also
   synchronized void display(String str){

            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }


    }
    // we can create a synchronize block
//    void display(String str){
//        synchronized (this) {
//            for (int i = 0; i < str.length(); i++) {
//                System.out.println(str.charAt(i));
//            }
//        }
//
//    }
}

class MyThread1 extends Thread{
    MyData d;
    MyThread1(MyData data){
        d = data;
    }
    public void run(){
        d.display("Hello World");
    }

}
class MyThread2 extends Thread{
    MyData d;
    MyThread2(MyData data){
        d = data;
    }
    public void run(){
        d.display(" Welcome");
    }
}

public class SyncronizationImplementing {
    public static void main(String[] args){
        MyData d= new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
    }
}

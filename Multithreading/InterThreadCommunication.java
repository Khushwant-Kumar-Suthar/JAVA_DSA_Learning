package JAVA_DSA_Learning.Multithreading;

class Producer extends Thread {
    SharedData d;

    Producer(SharedData data) {
        d = data;
    }

    public void run() {
        int i = 1;
        while (true) {
            d.set(i);
            System.out.println("Producer " + i);
            i++;
        }
    }
}

class Consumer extends Thread {
    SharedData d;

    Consumer(SharedData data) {
        d = data;
    }

    public void run() {
        while (true) {
            System.out.println("Consumer: " + d.get());
        }
    }
}

class SharedData {
    int value ;
    boolean flag = true;

    synchronized void set(int v) {
        // here wait and notify use for inter thread communicationn
        while (flag != true)
            try{ wait(); } catch (InterruptedException e){}
        value = v;
        flag = false;
        notify();
    }

    synchronized int get() {
        int x = 0;
        while (flag != false)
           try{ wait(); } catch (InterruptedException e){}
        x = value;
        flag = true;
        notify();
        return x;

    }


}

public class InterThreadCommunication {
    public static void main(String[] args) {
          SharedData d = new SharedData();
          Producer p = new Producer(d);
          Consumer c = new Consumer(d);
          p.start();
          c.start();
    }
}

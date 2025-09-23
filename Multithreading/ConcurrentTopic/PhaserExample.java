package JAVA_DSA_Learning.Multithreading.ConcurrentTopic;
import java.util.concurrent.Phaser;

class PhaserData implements Runnable{
    private Phaser phaser ;
    private String taskName;

    public PhaserData(Phaser phaser ,String taskName){
        this.phaser = phaser;
        this.taskName = taskName;
        phaser.register();  // registration thread to the Phaser
    }
    public void run(){
        System.out.println(taskName+" Started Phase 1.");
        phaser.arriveAndAwaitAdvance(); // wait for all thread to complete Phase 1

        System.out.println(taskName+" Started Phase 2.");
        phaser.arriveAndAwaitAdvance(); // wait for all thread to complete Phase 2
        System.out.println(taskName+" finished...");
        phaser.arriveAndDeregister();// deregister after completion
    }
}
public class PhaserExample {
    public static void main(String[] args){
        Phaser phaser = new Phaser();
        Thread t1 = new Thread(new PhaserData(phaser,"Task-1"));
        Thread t2 = new Thread(new PhaserData(phaser,"Task-2"));
        Thread t3 = new Thread(new PhaserData(phaser,"Task-3"));

        t1.start();
        t2.start();
        t3.start();

        // wait for all Phases to complete
        while (!phaser.isTerminated()){
            // waiting for the last phase
        }
        System.out.println("All tasks completed..........");
    }
}

package JAVA_DSA_Learning.Multithreading.forkJoin_pool;

import java.util.concurrent.ForkJoinPool;

public class RunningForkJoinPool {
    public static void main(String[] args){
        // create a ForkJoinPool
        // Executes an async task
        // uses available CPU cores efficiently
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(()-> System.out.println("Task executed by "+Thread.currentThread().getName()));
        pool.shutdown();

    }
}

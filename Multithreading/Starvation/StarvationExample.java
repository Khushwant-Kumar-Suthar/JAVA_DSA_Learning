package JAVA_DSA_Learning.Multithreading.Starvation;

public class StarvationExample {
        public static void main(String[] args) {
//            Runnable task = () -> {
//                System.out.println(Thread.currentThread().getName() + " is executing.");
//            };
//            Runnable highPriorityTask = () -> {
//                while (true) {  // Infinite loop to dominate CPU time
//                    System.out.println(Thread.currentThread().getName() + " is executing.");
//                }
//            };
            // solution of starvation using yield
            Runnable highPriorityTask = () -> {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + " is executing.");
                    Thread.yield(); // Allows other threads to run
                }
            };
            Runnable lowPriorityTask = () -> {
                System.out.println(Thread.currentThread().getName() + " is executing.");
            };

            Thread highPriorityThread1 = new Thread(highPriorityTask, "High-Priority-1");
            Thread highPriorityThread2 = new Thread(highPriorityTask, "High-Priority-2");
            Thread lowPriorityThread = new Thread(lowPriorityTask, "Low-Priority");

            // Set thread priorities
            highPriorityThread1.setPriority(Thread.MAX_PRIORITY); // 10
            highPriorityThread2.setPriority(Thread.MAX_PRIORITY); // 10
            lowPriorityThread.setPriority(Thread.MIN_PRIORITY);   // 1

            highPriorityThread1.start();
            highPriorityThread2.start();
            lowPriorityThread.start();
        }
    }



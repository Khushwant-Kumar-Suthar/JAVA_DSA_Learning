package JAVA_DSA_Learning.Multithreading.forkJoin_pool;

import java.util.concurrent.*;
import java.util.*;

class SortTask extends RecursiveAction {
    private int[] arr;
    private int start, end;
    private static final int THRESHOLD = 4;

    SortTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        if (end - start <= THRESHOLD) {
            Arrays.sort(arr, start, end); // base case: sort directly
            return;
        }
        int mid = (start + end) / 2;
        SortTask leftTask = new SortTask(arr, start, mid);
        SortTask rightTask = new SortTask(arr, mid, end);

        invokeAll(leftTask, rightTask); // run both task in parallel
    }
}

public class Recursive_Action {
    public static void main(String[] args) {
        int[] num = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ForkJoinPool pool = new ForkJoinPool();
        SortTask task = new SortTask(num, 0, num.length);
        pool.invoke(task);
        System.out.println("Sorted: " + Arrays.toString(num));
        pool.shutdown();
    }
}

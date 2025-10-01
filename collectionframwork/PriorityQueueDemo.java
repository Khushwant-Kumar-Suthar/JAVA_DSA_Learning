package JAVA_DSA_Learning.collectionframwork;
import java.util.Comparator;
import java.util.PriorityQueue;
// this class use for changing priority of this PriorityQueue by Comparator interface
// this class work on MAX Heap principle and without it or default it work on MIN Heap principle
class MyComp implements Comparator<Integer>{

    public int compare(Integer i , Integer j){
        if(i<j) return 1;
        if(i>j) return -1;
        return 0;
    }
}
public class PriorityQueueDemo {
    public static void main(String[] args) {
        // PriorityQueue is a part of Java's collection framework and implements the Queue interface.
        // It is used to hold elements prior to processing and orders its elements based on their natural ordering or by a specified comparator.

        // Importing the PriorityQueue class
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp() );

        // Adding elements to the PriorityQueue
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(2);
        pq.add(4);

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Removing elements from the PriorityQueue
        System.out.println("Removed element: " + pq.poll());
        System.out.println("PriorityQueue after removal: " + pq);

        // Peeking at the head of the PriorityQueue
        System.out.println("Head of PriorityQueue: " + pq.peek());

        // Checking the size of the PriorityQueue
        System.out.println("Size of PriorityQueue: " + pq.size());
    }
}

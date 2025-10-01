package JAVA_DSA_Learning.collectionframwork;

import java.util.ArrayDeque;

// arraydeque is a resizable array that implements the Deque interface
// it is not synchronized and permits null elements
// it is faster than linkedlist and stack
// it is not thread-safe
// it is a good choice for implementing stack and queue
// it is a good choice for implementing double-ended queue
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        // offerLast() and offerFirst() methods are used to add elements to the deque and
        // it is not throw exception if the deque is full
        dq.offerLast(10);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.forEach(System.out::println);
        dq.pollLast();
        // now it act like a stack
        System.out.println("After removing last element:");
        dq.forEach(System.out::println);
//  and now I use  pollLast() mean add first and romove first
// offerFirst() method is used to add elements at the front of the deque
//        dq.offerFirst(3);
//        dq.offerFirst(5);
//        dq.offerFirst(7);
//        System.out.println("After adding elements at the front:");
//        dq.forEach(System.out::println);
    }
}

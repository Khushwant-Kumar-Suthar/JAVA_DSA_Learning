package JAVA_DSA_Learning.collectionframwork;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> al1 = new LinkedList<>();
        // it implements doubly linked list data structure which contains
        // elements and pointers to next and previous elements
        // doubly linked list implements the Deque interface and list interface

        LinkedList<Integer> al2 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // all the methods of arraylist are also present in linkedlist
        // but linkedlist also have some additional methods
        // addFirst(), addLast(), getFirst(), getLast(), removeFirst(), removeLast
        // linkedlist is better than arraylist in insertion and deletion
        // but arraylist is better than linkedlist in searching and accessing
        // because linkedlist is not index based
        // linkedlist is a doubly linked list

        al1.addFirst(11);
        al1.add(12);
        al1.addAll(al2);
        System.out.println(al1.indexOf(12));
        System.out.println(al1);
        //al1.clear();
        System.out.println(al1);
        System.out.println(al1.isEmpty());
    }
}

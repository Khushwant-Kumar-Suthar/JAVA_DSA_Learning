package JAVA_DSA_Learning.collectionframwork;

import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {
        //  HashSet<Integer> hs = new HashSet<>();
        // here 25 indicate only 25% of size is use in hash table mean  here size is 20 but only allowed 5 element
        // will be store in it because of 25% if we store more initialCapacity increase automatically
       // duplicate not allowed
        HashSet<Integer> hs = new HashSet<>(20, 0.25f);

        // Order is not confirm it may change because of hash table storing value in linkedlist or  open addressing
        hs.add(10);
        hs.add(20);
        hs.addAll(List.of(20, 30, 40, 50, 60));
        // hs.remove(30);
        hs.forEach(System.out::println);
    }
}

package JAVA_DSA_Learning.Multithreading.concurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("Khushwant",1);
        map.put("Amrit",2);
        map.computeIfAbsent("Karishma",k->3); // atomically insert if key is absent
        System.out.println(map);
    }
}

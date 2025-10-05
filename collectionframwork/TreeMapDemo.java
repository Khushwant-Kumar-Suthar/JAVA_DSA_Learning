package JAVA_DSA_Learning.collectionframwork;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "Khushwant", 2, "Harish", 3, "Karishma", 4, "Kiran"));
        tm.put(5, "Geeta");
        tm.put(6, "Arvind");
        tm.put(7, "Nachita");
        System.out.println(tm);
        // for iterating into treemap or hashmap first convert into set and map the entry
        // then create iterator for iterating
        // way 1
        System.out.println("---->>>Way 1 for traversing---->>>>>");
        java.util.Set<Map.Entry<Integer, String>> entrySet = tm.entrySet();
        entrySet.forEach(System.out::println);
        //way 2
        System.out.println("------->>>>>Way 2 for traversing------->>>>>>");
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        // way 3
        System.out.println("----->>>Way 3 for traversing---->>>>>");
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}

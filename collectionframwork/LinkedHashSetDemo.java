package JAVA_DSA_Learning.collectionframwork;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args){
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        lhs.add("Khushwant");
        lhs.add("Karishma");
        lhs.add("Kiran");
        lhs.add("Harish");
        lhs.add("Nachita");

        lhs.forEach(System.out::println);
        // by using iterator
        System.out.println("By using iterator ");
        Iterator<String> it = lhs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

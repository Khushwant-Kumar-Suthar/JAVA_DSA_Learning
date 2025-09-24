package JAVA_DSA_Learning.collectionframwork;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();

        ArrayList<Integer> al2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        al1.add(0, 11);
        al1.add(12);
        al1.addAll(al2);
        System.out.println(al1.indexOf(12));
        System.out.println(al1);
        //al1.clear();
        System.out.println(al1);
        System.out.println(al1.isEmpty());
        // there are many more methods in list interface
        // you can explore them on your own

        for(int num : al1){
            System.out.println(num);
        }

        // using iterator
        Iterator<Integer> it = al1.iterator();
        System.out.println("Using Iterator");
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

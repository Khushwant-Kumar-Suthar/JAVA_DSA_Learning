package JAVA_DSA_Learning.collectionframwork;

import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args){
        // now this access and print based on least recently use principle
        java.util.LinkedHashMap<Integer,String> lhm = new java.util.LinkedHashMap<>(5,0.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry e) {  //this method use to define the limit in program for linkedHashMap
                return size()>5;
            }
        };
        lhm.put(1,"Khushwant");
        lhm.put(2,"Kiran");
        lhm.put(3,"Nachita");
        lhm.put(4,"Geeta");
        // now we access this order(4->3->1   1 just use)
        lhm.get(4);
        lhm.get(3);
        lhm.get(1);
        lhm.forEach((k,v)->System.out.println("Key: "+k+" Value: "+v));

    }
}

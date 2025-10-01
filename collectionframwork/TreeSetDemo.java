package JAVA_DSA_Learning.collectionframwork;
import  java.util.*;

public class TreeSetDemo {
   public static void main(String[] args){
       TreeSet<Integer> ts = new TreeSet<>();
       ts.add(10);
       ts.add(5);
       ts.add(8);
       ts.addAll(List.of(30,20,40,10,50,45));
       System.out.println("using ceiling this gave equal or nearest greater number: "+ts.ceiling(46));
       // this is sorted value store
       ts.forEach(System.out::println);
    }
}

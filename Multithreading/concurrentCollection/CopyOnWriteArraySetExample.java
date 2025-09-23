package JAVA_DSA_Learning.Multithreading.concurrentCollection;
import java.util.concurrent.CopyOnWriteArraySet;
public class CopyOnWriteArraySetExample {
    public static void main(String[] args){
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(2); // duplicate ignored
        System.out.println(set);
    }
}

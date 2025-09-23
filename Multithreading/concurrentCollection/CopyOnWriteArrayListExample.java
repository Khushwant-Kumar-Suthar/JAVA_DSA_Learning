package JAVA_DSA_Learning.Multithreading.concurrentCollection;
import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListExample {
    public static void main(String[] args){
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Khushwant");
        list.add("Amrit");
        for(String item:list){
            System.out.println(item);
        }
    }
}

package JAVA_DSA_Learning.genericsdemo;
import java.lang.*;
public class GenericDemo<T> {
    // here I create a generic type array
    T []data = (T[]) new Object[3];

    public static void main(String[] args) {
//        // before generic if we do generalization
//        Object obj = new String("Khushwant");
//        obj = new Integer(10);
//        String str = (String)obj;
        GenericDemo<String> gd = new GenericDemo<>();
        gd.data[0] = "Hi";
        gd.data[1] = "sk";
        // gd.data[2] =10; here compiler mark our mistake


    }
}

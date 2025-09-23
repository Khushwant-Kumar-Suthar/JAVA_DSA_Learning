package JAVA_DSA_Learning.ExceptionHandling;
import java.lang.ArithmeticException;
public class TryCatch1 {
    public static void main(String[] args){
        int a, b, c;
        a = 5;
        b = 0;
        try{
            c = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero not allowed and give a error "+e);
        }
    }
}

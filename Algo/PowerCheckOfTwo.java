package JAVA_DSA_Learning.Algo;
import java.util.*;
public class PowerCheckOfTwo {
    public static void numberCheck(int n){
        int checker =  n & n-1;
        if(checker==0)
            System.out.println(n+" The Number is power of 2 ");
        else
            System.out.println(n+" Number is not a power of 2");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for check number is a power of 2 or not ");
        int num = in.nextInt();
        numberCheck(num);

    }
}

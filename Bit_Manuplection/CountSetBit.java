package JAVA_DSA_Learning.Bit_Manuplection;
import java.util.*;
public class CountSetBit {
    public static int countSetBit(int n){
        int count = 0;
        while (n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check set bit in his binary form: ");
        int num = in.nextInt();
        System.out.println("Set bit in given number is "+countSetBit(num));
    }
}

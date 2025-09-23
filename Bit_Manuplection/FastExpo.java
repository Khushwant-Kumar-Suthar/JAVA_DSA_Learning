package JAVA_DSA_Learning.Bit_Manuplection;
import java.util.*;
public class FastExpo {
    public static int fastExpo(int num , int pow){
        int ans = 1;
        while (pow>0){
            if((pow&1)!=0) { // check lsb
                ans = ans*num;
            }
            num = num*num;
            pow = pow>>1;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number and its exponential power ");
        int num = in.nextInt() ;
        int pow = in.nextInt();
        System.out.println(pow+" power of "+num+" is "+fastExpo(num,pow));
    }
}

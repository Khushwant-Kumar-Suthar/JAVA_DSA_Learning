package JAVA_DSA_Learning.StringOp;
import java.util.*;
public class CountVowels {
    public static int countVowels(String str){
        int count = 0;
        for(int i =0 ;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i'|| ch=='o' || ch == 'u')
                count++;
            }
        return count;
    }
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       StringBuilder sb = new StringBuilder("");
       sb.append(in.nextLine());
       System.out.println("Number of vowels in given String is : "+countVowels(sb.toString()));

   }
}

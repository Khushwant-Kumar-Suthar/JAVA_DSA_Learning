package JAVA_DSA_Learning.StringOp;
import java.util.*;
public class SbString {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i)); // space add in new Change String
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        sb.append(in.nextLine());
        System.out.println("Upper case each latter first word is : "+toUpperCase(sb.toString()));

    }
}

package JAVA_DSA_Learning.OOPS;
import java.util.*;
class Rectangle{
    public int length ;
    public int breath;
    // when we want to hide a data then we create a private data
    /*
    * private int length;
    * private int breath;
    * // read length and breath
    * public int getLength(){
    * return length;
    * }
    * public int getBreath(){
    * return breath;
    * }
    * // set length and breath
    * public void setLength(int l){
    * length = l;
    * }
    * public void setBreath(int b){
    * breath = b;
    * }
    * */
    public int area(){
        return length*breath;
    }
    public int parameter(){
        return 2 *(length+breath);
    }
}
public class ClassObject {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a length and breath of rectangle here:");
        int L = in.nextInt();
        int B = in.nextInt();
        Rectangle R = new Rectangle();
        R.length = L;
        R.breath = B;
        // R.setLength(L);
        // R.setBreath(B);
        System.out.println("Area of rectangle is: "+R.area());
        System.out.println("Parameter of rectangle is: "+R.parameter());

    }
}

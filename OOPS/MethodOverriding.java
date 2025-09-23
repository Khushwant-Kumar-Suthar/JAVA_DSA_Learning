package JAVA_DSA_Learning.OOPS;
import java.lang.*;
class Super{
    public void display(){
        System.out.println("Hello");
    }
}
class Sub extends Super{
   @Override
    public void display(){
        System.out.println("Hello User");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        // this is way of dynamic method dispatch
        System.out.println("dynamic method dispatch:--");
        Super su = new Sub();
        su.display();
        // and this is normal call
        System.out.println("Normal call:--");
        Super s = new Super();
        s.display();
        Sub sb = new Sub();
        sb.display();
    }
}

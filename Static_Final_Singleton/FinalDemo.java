package JAVA_DSA_Learning.Static_Final_Singleton;

class test{
    // -----------------second way of use final keyword by final method for restricted overriding-----------------
    public final void show(){
        System.out.println("Hello");
    }

}
// ----------third way of use final keyword by creating class as final for restricted inherit or extending-----------
//final class test{
//    public final void show(){
//        System.out.println("Hello");
//    }
//
//}
// --------------------  we can't inherit a final class ------------------------------
class test1 extends test{
//    public void show(){
//       we can't override because its final
//    }
}
public class FinalDemo {
    //---------------------------------- first way of use final keyword in variable or identifier ---------------------
    // first way to initialize final variable and we use static because we want to print inside a main
    static final int a = 10;
    static final int b;
     final int c;
     // second way to initialize b using static way
    static {
        b = 6;
    }
    // third way to initialize c using constructor
    public FinalDemo(){
        c = 3;
    }

    public static void main(String[] args){
        System.out.println(a+" "+b);
        FinalDemo s = new FinalDemo();
        System.out.println(s.c);
    }
}

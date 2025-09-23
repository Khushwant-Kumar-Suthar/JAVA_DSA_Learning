package JAVA_DSA_Learning.InnerClasses;
class test1{
    static int x = 8;
    int y = 9;
    static class test2{
        void show(){
            System.out.println("Static value of x ="+x);
            // we can't access the non-static member of outer class
            // System.out.println(y);
        }
    }
}
public class StaticInnerClass {
    public static void main(String [] args){
        // in static inner class we don't require to create a object of outer class like nested inner class we can access directly without create object of outer class
        // nested inner class call
        // Outer.Inner oi = new Outer().new Inner();
        // but static inner class call
        test1.test2 tt= new test1.test2();
        tt.show();
    }
}

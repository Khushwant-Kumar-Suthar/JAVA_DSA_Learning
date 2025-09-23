package JAVA_DSA_Learning.InnerClasses;

//for Outer class ----Outer.class-------- file create
class Outer {

    int X = 8;
    // we can define here inner class object
     Inner i = new Inner();

     // for inner class separate class file create which name---- Outer$Inner.class---------
    class Inner {
        int y = 4;

        // here we can directly access the outer class variable inside inner class
        void innerDisplay() {
            System.out.println("For inner class display method X= " + X + " and y= " + y);
        }
    }

    void outerDisplay() {
        // if we want to access the inner class element then we want to create a object of inner class and then we can acces
       // Inner i = new Inner();
        System.out.println("For outer class display method X = " + X + " and y = " + i.y);
    }

}
// for this--------- NestedClass.class------ file create
public class NestedClass {

    public static void main(String[] args) {
        // calling outer class
        Outer o = new Outer();
        o.outerDisplay();

        // calling inner class method we want to create object first we create object of outer class then we create object for inner class

        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();
    }
}

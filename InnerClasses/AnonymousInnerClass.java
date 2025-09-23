package JAVA_DSA_Learning.InnerClasses;

abstract class My {
    abstract void display();
}

class outer {
      // Anonymous inner class can access member of outer class
    // Anonymous inner class can extends exactly one class and implement exactly one interface ---- why---------
    //In Java, an anonymous inner class has the following limitations:
      //Single Inheritance: It can extend only one class. This means it can inherit from a single parent class to acquire its properties and behaviors.
      //Single Interface Implementation: It can implement only one interface. This allows it to fulfill the contract defined by a single interface.
    public void meth() {

        // Anonymous class is created at time of object creation
        My m = new My() {
            void display() {
                System.out.println("This in anonymous class call which is create at object creation time ");

            }
        };
        m.display();

    }

}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        outer o = new outer();
        o.meth();
    }
}

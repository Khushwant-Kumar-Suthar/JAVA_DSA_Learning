package JAVA_DSA_Learning.OOPS;

 abstract class Parent{
   // Parent class constructor
    public Parent(){
       System.out.println("Super class:");
   }
   public void meth1(){
       System.out.println("Super method 1:");
   }
   abstract public void meth2();
   }

// meth2 override so subclass become concrete class and we can create a object of concrete class but we cannot create a object of abstract class
class Child extends Parent{
    @Override
     public void meth2(){
        System.out.println("Sub method 2:");
    }
}

public class AbstractClass {
    public static void main(String[] args){
        Child p = new Child();
    

        p.meth1();
        p.meth2();

    }
}

package JAVA_DSA_Learning.Static_Final_Singleton;
class statics {
    // outer class can't be static
    // only inner class can be static
    static int a = 10;
    int b = 20;

    void show() {

        System.out.println("non-static method call");
        System.out.println(a);
        System.out.println(b);
        // here we can access because show is non-static method
        // means static variable call inside non-static method possible
        // but non-static variable not access inside a static method
    }
    static void display(){
        System.out.println("static method display call, a="+a);
        //   System.out.println(b);
        // here b can't access because it is a non static variable and we can't access inside  static method
    }
    // static method can be overloaded

}


public class StaticClass {
    static {
        System.out.println("Static block1 outside a main but it executed because static loaded when class loaded");
    }
    public static void main(String[] args){
        // static members will have just a single copy and it will be shared by both the object
        statics s = new statics();
        s.a = 5;
        s.b = 4;
        s.show();
        statics s2 = new statics();
        s2.show(); // here a is updated to 5 and b can't chnage because it will be only updated for s object not for s2 object and b is non-static method also


    }
    static {
        System.out.println("Static block 2");
    }
}

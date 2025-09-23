package JAVA_DSA_Learning.OOPS;
interface Test1{
    public void meth1();
    public void meth2();
}

class Test2 implements Test1{

    @Override
    public void meth1(){
        System.out.println("Hi this is method 1 of Test2 class:");
    }
    @Override
    public void meth2(){
        System.out.println("Hi this is method 2 of Test2 class:");
    }
}
public class Interfaces {
    public static void main(String [] args){
        Test1 t = new Test2();
        t.meth1();
        t.meth2();

    }
}

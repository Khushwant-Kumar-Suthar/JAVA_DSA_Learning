package JAVA_DSA_Learning.ExceptionHandling;

class LowBalanceException extends Exception{
    public String toString(){
        return "Your minimum balance is low";
    }
}

public class UserDefineException {
    static void fun1(){
        try{
           throw  new LowBalanceException();
        }
        catch (LowBalanceException e){
            System.out.println(e);
        }
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

    public static void main(String []args){
         fun3();
    }
}

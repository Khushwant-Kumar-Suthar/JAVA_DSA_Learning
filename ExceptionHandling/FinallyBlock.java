package JAVA_DSA_Learning.ExceptionHandling;

public class FinallyBlock {

    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("division by zero is not valid "+e.getMessage());
        }
        finally {
            System.out.println("final block must be executed weather exception occurs or not  ");
        }


    }
}

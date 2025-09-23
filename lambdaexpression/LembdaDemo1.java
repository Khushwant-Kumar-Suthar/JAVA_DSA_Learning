package JAVA_DSA_Learning.lambdaexpression;

/**
 * @author khushwant
 * creating functional interface which having only one method
 */
@FunctionalInterface
interface Lambda{
    public void display();
}
public class LembdaDemo1 {
    public static void main(String[] args){
        Lambda m = ()->{System.out.print("Hello lambda: ");};
        m.display();
    }
}

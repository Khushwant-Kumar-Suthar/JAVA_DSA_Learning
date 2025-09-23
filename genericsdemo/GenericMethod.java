package JAVA_DSA_Learning.genericsdemo;

public class GenericMethod {
    @SafeVarargs
    static <E> void show(E... list){
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args){
             show("HI","Khushwant","Kumar");
             show(2,3,4,5,6,7);

    }
}

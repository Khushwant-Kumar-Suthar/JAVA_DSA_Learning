package JAVA_DSA_Learning.InnerClasses;
class OUTER{
    void display(){
        class INNER{
            void innerDisplay(){
                System.out.println("Hi this is local inner class which is create inside a outer class method:");
            }
        }
        INNER i = new INNER();
        i.innerDisplay();
    }
}
public class LocalInnerClass {
    public static void main(String[] args){
        OUTER  o = new OUTER();
        o.display();
    }
}

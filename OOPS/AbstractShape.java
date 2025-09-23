package JAVA_DSA_Learning.OOPS;


abstract class Shape{
    public Shape(){
        System.out.println("Abstract class extends by circle and rectangle class");
    }
    abstract public double parameters();
    abstract public double area();
}
// Circle class name written like this not CIRCLE ok but we write because same package have existed circle class all ready
class CIRCLE extends Shape {
    double radius;
// if we pass parameters in area method then its become a overloading not overriding
    public double area() {
        return Math.PI*radius*radius;
    }

    public double parameters() {
         return 2*Math.PI*radius;
    }
}

class RECTANGLE extends Shape{
    double length ;
    double breadth;
    public double area(){
     return length*breadth;
    }
    public double parameters(){
        return 2*(length+breadth);
    }
}
public class AbstractShape {
    public static void main(String[] args){
        CIRCLE s = new CIRCLE();
        s.radius = 2;
        System.out.println("Area of circle is : "+s.area());
        System.out.println("Parameters of circle is :"+s.parameters());

        RECTANGLE R = new RECTANGLE();
        R.length = 4.05;
        R.breadth  = 2.35;
        System.out.println("Area of rectangle is :"+R.area());
        System.out.println("Parameters of rectangle is :"+R.parameters());
    }
}

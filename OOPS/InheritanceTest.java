package JAVA_DSA_Learning.OOPS;
class Circle {
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double parimeter(){
        return 2*Math.PI*radius;
    }
}
class Cylinders extends Circle{
    public double height ;

    public double volume(){
        return area()*height ;
    }
}
public class InheritanceTest {
    public static void main(String[] args) {
        Cylinders c1 = new Cylinders();
        c1.radius = 7;
        c1.height = 10;
        System.out.println("Volume of Cylinder "+c1.volume());
        System.out.println("Area: "+c1.area());
    }
}

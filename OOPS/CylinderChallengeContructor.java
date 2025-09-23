package JAVA_DSA_Learning.OOPS;


class Cylinder{  // constructor me value pass karte tab get method me parameters pass nhi karte set method me hi karte hai
    private double radius ;
    private double height ;
    Cylinder(){
        radius = height = 1;
    }
    Cylinder (double r , double h){
        height = h;
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight (){
        return height;
    }
    public void setRadius(double r){
        if(r>0){
            radius = r;
        }
        else radius = 0;
    }
    public void setHeight(double h){
        if(h>0){
            height =h;
        }
        else height = 0;
    }

    public double area(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
    public double volume(){
        return   Math.PI*radius*radius*height;
    }

}


public class CylinderChallengeContructor {
    public static void main (String [] args){
        Cylinder C = new Cylinder();
        C.setRadius(3.4);
        C.setHeight(5);
        System.out.println("Surface area of Cylinder is "+ C.area());
        System.out.println("Volume of Cylinder is "+C.volume());
        System.out.println("Given radius is: "+C.getRadius());
        System.out.println("Height is "+C.getHeight());
    }
}

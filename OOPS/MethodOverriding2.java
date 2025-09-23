package JAVA_DSA_Learning.OOPS;

class Car{
    public void start(){
        System.out.println("Car is starting: ");
    }
    public void accelerate(){
        System.out.println("Car is accelerating:");
    }
    public void Break(){
        System.out.println("Breaking is apply:");
    }
}

class LuxaryCar extends Car{
    @Override
    public void start(){
        System.out.println("Car is starting: ");
    }
    @Override
    public void accelerate(){
        System.out.println("Car is accelerating:");
    }
    @Override
    public void Break(){
        System.out.println("Breaking is apply:");
    }
    public void gps(){
        System.out.println("Your location is tracking: ");
    }
    public void sos(){
        System.out.println("Driver in emergency situation:");
    }
}
public class MethodOverriding2 {
    public static void main(String[] args){
        Car C = new Car();
        C.start();
        C.accelerate();
        C.Break();

        LuxaryCar LC = new LuxaryCar();
        LC.start();
        LC.gps();
        LC.Break();

    }
}

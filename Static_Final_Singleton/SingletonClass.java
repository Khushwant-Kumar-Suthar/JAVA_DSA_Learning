package JAVA_DSA_Learning.Static_Final_Singleton;
class CoffeeMachine{
    private float coffeeOty;
    private float milkOty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine myCoffee = null;
    private CoffeeMachine(){
        coffeeOty = 1;
        milkOty = 3;
        waterQty = 1.5f;
        sugarQty = 1;
    }
    static public CoffeeMachine getInstance() {
        if (myCoffee == null)
            myCoffee = new CoffeeMachine();
        return myCoffee;
    }
}
public class SingletonClass {
    public static void main(String[] args){
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3) System.out.println("Same reference because they are referring same object ");



    }
}

package JAVA_DSA_Learning.Multithreading;
class ATM{
   synchronized public void checkBalance(String name ){
        System.out.print(name+" Checking ");
        try{ Thread.sleep(100);} catch (Exception e){}
        System.out.println("Balance");
    }
    synchronized public void withdraw(String name, int amount){
        System.out.println(name+" Withdrawing "+amount);
        try{ Thread.sleep(100);} catch (Exception e){}
        System.out.println("Withdrawn successful");
    }
}
class Coustmer extends Thread{
    ATM atm;
    String name ;
    int amount ;
    Coustmer (String n,ATM a,int am){
        name = n;
        atm = a;
        amount = am;
    }
    public void useAtm(){
           atm.checkBalance(name);
           atm.withdraw(name,amount);
    }
    public void run(){
        useAtm();
    }
}
public class AtmChallenge {
    public static void main(String[] args){
        ATM atm = new ATM();
        Coustmer c1 = new Coustmer("Khushwant",atm,100);
        Coustmer c2 = new Coustmer("Amrit",atm,5000);
        c1.start();
        c2.start();

    }
}

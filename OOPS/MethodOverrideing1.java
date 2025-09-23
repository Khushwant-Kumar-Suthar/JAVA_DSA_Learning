package JAVA_DSA_Learning.OOPS;
class TV {
    public void switchON(){ System.out.println("TV is switched ON: ");}
    public void changeChannel(){ System.out.println("Channel is changed: ");}
}

class SmartTV extends TV{
    @Override
    public void switchON(){ System.out.println("Smart TV Switched ON:");}
    @Override
    public void changeChannel(){ System.out.println("Channel is changed: ");}
    public void browse(){
        System.out.println("Smart TV Browsing:");
    }
}
public class MethodOverrideing1 {
    public static void main(String[] args){
      TV t = new TV();
      t.switchON();
      t.changeChannel();

      SmartTV st = new SmartTV();
      st.switchON();
      st.browse();
    }
}

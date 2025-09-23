package JAVA_DSA_Learning.OOPS;
class Phone{
    public void call(){
        System.out.println("Calling to Harish........");
    }
    public void sms(){
        System.out.println("Type the Message to Harish:");
        System.out.println("SMS sending successfully.... ");
    }
}
interface Camera{
    public void click();
    public void videoRecord();
}
interface MusicPlayer{
   public   void play();
    public void stop();
    public void pause();
}

class SmartPhone extends Phone implements Camera , MusicPlayer{
    void videoCall(){
        System.out.println("Video Calling to Harish......");
    }
    @Override
   public void click(){
       System.out.println("Picture taken :");
    }
    @Override
    public void videoRecord(){
        System.out.println("Video recording start:");
    }
    @Override
    public void play(){
        System.out.println("Music Playing: ");
    }
    @Override
    public void pause(){
        System.out.println("Music is pause:");
    }
    @Override
    public void stop(){
        System.out.println("Music is stop:");
    }

}
public class InterfacePhone {
    public static void main(String [] args){
        SmartPhone s = new SmartPhone();
        s.videoCall();
        s.sms();
        s.call();

    }
}

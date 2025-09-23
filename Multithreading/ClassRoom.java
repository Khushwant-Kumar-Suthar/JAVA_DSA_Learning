package JAVA_DSA_Learning.Multithreading;

class WhiteBoard{
    String text ;
    int noOfStudent = 0;
    int count = 0;
    public void attendence(){
         noOfStudent++;
    }
  synchronized   public void write(String msg){
        System.out.println("Teacher is writing "+msg);
        while (count!=0)
            try{ wait();}catch (Exception e){}
            text =  msg;
           count = noOfStudent;
           notifyAll();
    }
   synchronized public String read(){

        while (count==0)
            try{ wait();}catch (InterruptedException e){}
          String  notdown = text;
          count--;
          if(count==0)
                   notify();
          return notdown;
    }
}
class Teacher extends Thread{
    WhiteBoard wh;
    String [] str = {"Java is a programming language ","It is OOPs based","It support multithreading","End"};
    Teacher(WhiteBoard board){
     wh = board;
    }
    public void run(){
        for (int i = 0;i<str.length;i++){
            wh.write(str[i]);
        }
    }
}
class Student extends Thread{
    String name ;
    WhiteBoard wh ;
    Student(String n, WhiteBoard board ){
        name = n;
        wh = board;
    }
    public void run(){
        String text;
        wh.attendence();
        do{
                text = wh.read();
        System.out.println(name+" Reading "+text);
            System.out.flush();

        }
        while (!text.equals("End"));
    }
}
public class ClassRoom {
    public static void main(String[] args){
        WhiteBoard wh = new WhiteBoard();
        Teacher t = new Teacher(wh);
        Student s1 = new Student("1. Khshwant",wh);
        Student s2 = new Student("2. Amrit",wh);
        Student s3 = new Student("3. Kiran",wh);
        Student s4 = new Student("4. Karishma",wh);
        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();





    }
}

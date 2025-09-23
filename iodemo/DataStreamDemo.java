package JAVA_DSA_Learning.iodemo;

import java.io.*;

class DataStreamDemo {
   public static void main(String[] args) throws Exception{
       FileOutputStream fos = new FileOutputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/MyData");
       DataOutputStream d = new DataOutputStream(fos);
       Student s = new Student();
       s.rollno = 111;
       s.name ="John";
       s.dept="ESE";
       d.writeInt(s.rollno);
       d.writeUTF(s.name);
       d.writeUTF(s.dept);
       d.close();
       fos.close();
   }
}
class MyReadData{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/MyData");
        DataInputStream d = new DataInputStream(fis);
        Student s = new Student();
           s.rollno = d.readInt();
           s.name = d.readUTF();
           s.dept = d.readUTF();
        System.out.println("Roll No.-"+s.rollno+" Name-"+s.name+" Department-"+s.dept);
        d.close();
        fis.close();
    }
}
package JAVA_DSA_Learning.iodemo;

import java.io.*;
class StudentSerial implements Serializable{
    int rollno;
    String name;
    String dept;
}

class MySerialWrite{
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/SerializationData");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        StudentSerial st = new StudentSerial();
        st.rollno = 110;
        st.name ="John";
        st.dept = "CSE";
        oos.writeObject(st);
    }
}

class MySerialRead{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/SerializationData");
        ObjectInputStream ois = new ObjectInputStream(fis);
        StudentSerial st;
        st = (StudentSerial)ois.readObject();
        System.out.println("Roll No.-"+st.rollno+" Name-"+st.name+" Department-"+st.dept);
    }
}

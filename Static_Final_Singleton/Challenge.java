package JAVA_DSA_Learning.Static_Final_Singleton;

import java.util.*;
// here we want to generate roll number automatically not inside a main method by creating new object
// so here we use static way and generate roll number inside a class and when we create a object of this class it automatically get we doesn't want to assign a rollNumber again and again
class Student{
    private String rollNumber;
    private static int count = 1;
    private String generateRollNumber(){
        Date d = new Date();
        String rn = "UOR-"+(d.getYear()+1900)+"-"+count; // becuase getYear method give 124 and we add into 1900 this gave 2024
        count++;
        return rn;
    }
    public Student(){
        rollNumber = generateRollNumber();
    }
    public String getRoll(){
        return rollNumber;
    }
}
public class Challenge {
    public static void main(String[] args){
          Student s1 = new Student();
          Student s2 = new Student();
          Student s3 = new Student();
        System.out.println(s1.getRoll());
        System.out.println(s2.getRoll());
        System.out.println(s3.getRoll());
    }
}

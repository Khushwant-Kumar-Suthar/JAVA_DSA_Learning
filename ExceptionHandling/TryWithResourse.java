package JAVA_DSA_Learning.ExceptionHandling;
import java.io.*;
import java.util.*;
public class TryWithResourse {
   // static FileInputStream fi;
    static void msg() throws Exception{
       //  fi = new FileInputStream("/A:/sk.txt");
         try(FileInputStream  fi = new FileInputStream("/A:/sk.txt");Scanner in = new Scanner(fi)) {
             String str = in.nextLine();
             int a = in.nextInt();
             int b = in.nextInt();
             System.out.println(str);
             System.out.println(a / b);
         }

    }
    public static void main(String[] args) throws Exception{
        try {
            msg();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

package JAVA_DSA_Learning.iodemo;

import java.io.*;

public class StudentChallenge {
    public static void main(String[] args) throws Exception{
        float list[] ={10.5f,2.9f,6.4f,3.7f};
        // write
        FileOutputStream fos = new FileOutputStream("D://javaCode//JAVA_DSA//iodemo//IoDemoData//Data");
        DataOutputStream dos = new DataOutputStream(fos);
          dos.writeInt(list.length);
         for(float x:list){
             dos.writeFloat(x);
         }
         dos.close();
         fos.close();
         // read
        FileInputStream fis = new FileInputStream("D://javaCode//JAVA_DSA//iodemo//IoDemoData//Data");
        DataInputStream dis = new DataInputStream(fis);
        int n = dis.readInt();
        for(int i = 0;i<n;i++){
            System.out.println("Data is : "+dis.readFloat());
        }
        dis.close();
        fis.close();
    }
}

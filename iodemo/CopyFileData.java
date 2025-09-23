package JAVA_DSA_Learning.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileData {
    public static void main(String [] args) throws Exception{

        FileInputStream fis = new FileInputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/source1.txt");
        FileOutputStream fos = new FileOutputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData//source2Copying.txt");
         int b;
         while((b = fis.read())!=-1){
             if(b>=65 && b<=90) fos.write(b+32);
             else fos.write(b);
         }
             System.out.println("Data Copy successfully");

         fis.close();
         fos.close();

    }
}

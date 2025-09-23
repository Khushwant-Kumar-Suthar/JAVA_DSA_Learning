package JAVA_DSA_Learning.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;


public class Copy2FileData {
    public static  void main(String [] args) throws Exception{

        FileInputStream file1 = new FileInputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/source1.txt");
        FileInputStream file2 = new FileInputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/source2Copying.txt");

        FileOutputStream fos = new FileOutputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/destination.txt");

        SequenceInputStream sis = new SequenceInputStream(file1,file2);
        int b;
        while ((b = sis.read())!=-1){
            fos.write(b);
        }

        sis.close();
        fos.close();
        file2.close();
        file1.close();
        

    }
}

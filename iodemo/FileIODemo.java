package JAVA_DSA_Learning.iodemo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIODemo {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
        // first we create a new file using FileOutput stream and write a some data
        // try with resource where resource automatically close
        try(FileOutputStream fos = new FileOutputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/Sample.txt")){
            System.out.println("Write a Text data for Sample file: ");
            String str = in.nextLine();
            fos.write(str.getBytes());
          /*for one by one means byte byte data transfer
             byte[] b = str.getBytes();
             for(byte x:b)
                 fos.write(x);

           */
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }

        // for reading a data fileinput stream use
        try(FileInputStream fis = new FileInputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/Sample.txt")){
            // this available method gives length of data
            byte []b = new byte[fis.available()];
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}

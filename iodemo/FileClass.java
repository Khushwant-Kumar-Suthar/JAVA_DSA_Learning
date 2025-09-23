package JAVA_DSA_Learning.iodemo;
import java.io.*;
public class FileClass {
    public static void main(String[] args) throws Exception{
        File f = new File("D:/javaCode");
        System.out.println("Checking the given javaCode folder is directory or not: "+f.isDirectory());
        String list[] = f.list();
        for(String s: list){
            System.out.println(s);
        }
       File file[] = f.listFiles();
        for(File fs:file){
            System.out.println(fs.getName()+" "+fs.getPath());
        }
        // more method we can use like this

    }
}

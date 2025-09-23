package JAVA_DSA_Learning.iodemo;
import java.io.*;
class Student {
    int rollno;
    String name;
    String dept;
}
//  solution for storing the object of that student class in a file ---- Solution  1-----------
class MyWrite{
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/Mytext");
        PrintStream ps = new PrintStream(fos);
        Student st = new Student();
        st.rollno = 110;
        st.name ="Khushwant";
        st.dept = "CSE";
        ps.println(st.rollno);
        ps.println(st.name);
        ps.println(st.dept);
           ps.close();
           fos.close();
    }
}
class MyRead{
    public static void main(String [] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:/javaCode/JAVA_DSA/iodemo/IoDemoData/Mytext");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        Student st = new Student();
        st.rollno = Integer.parseInt(br.readLine());
        st.name=br.readLine();
        st.dept=br.readLine();
        System.out.println(st.rollno+" "+st.name+" "+st.dept);
        br.close();
        fis.close();
    }
}

// solution 2 for storing the object in their own data type --------------------- Solution 2---------------------


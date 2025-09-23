package JAVA_DSA_Learning.iodemo;

import java.io.*;
import java.util.Scanner;

class Customer implements Serializable {
    String custID;
    String name;
    String phone;
    static int count = 0;

    public Customer() {
    }

    public Customer(String name, String phone) {
        custID = "C"+count;
        count++;
        this.name = name;
        this.phone = phone;
    }
    public String toString(){
        return "Customer ID: "+custID+" Name:"+name+" Phone:"+phone+"\n";

    }
}

public class CustomerChallenge {
    // write
//    public static void main(String[] args) throws Exception{
//        Customer[] list = {new Customer("Khushwant","7891076900"),new Customer("Geeta","8829091393"),new Customer("Arvind","9983109730")};
//        FileOutputStream fos = new FileOutputStream("CustomerData");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeInt(list.length);
//        for(Customer c:list){
//            oos.writeObject(c);
//        }
//        oos.close();
//        fos.close();
//    }
    // read
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("CustomerData");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int n = ois.readInt();
        Customer list[] = new Customer[n];
        for(int i =0;i<n;i++){
            list[i] = (Customer) ois.readObject();
        }
        System.out.println("Enter a name :");
        String name = sc.next();

        for (int i =0;i<n;i++) {
            if (name.equalsIgnoreCase(list[i].name)) System.out.println(list[i]);

        }
    }
}

package JAVA_DSA_Learning.OOPS;

interface Members {
    public void callBack();
}

class Store {

    //This array stores references to objects, not the objects themselves.
    // if we write these--  Members m = new Members(); it gave error because we create a object directly not reference
    Members m[] = new Members[10];

    int count = 0;

    public void register(Members me) {

        m[count++] = me;

    }

    public void invite() {
        for (int i = 0; i < count; i++) {
            m[i].callBack();
        }
    }
}

class Customer implements Members {
    String name;

    public Customer(String n) {
        name = n;
    }

    public void callBack() {
        System.out.println("Hi, " + name + " there is sales ongoing please visit the nearest store as soon as possible : ");
    }
}

public class CallBack {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Harish");
        Customer c2 = new Customer("Khushwant");

        s.register(c1);
        s.register(c2);
        s.invite();
    }
}

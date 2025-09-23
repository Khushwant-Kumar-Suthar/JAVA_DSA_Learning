package JAVA_DSA_Learning.genericsdemo;

@SuppressWarnings("unchecked")
// it will take as a multiple parameters like <K,V>
        // for than Object is MyArray<String,Integer> arr = new MyArray<>();
class MyArray<T> {
    /*
     Question-->> why object is created by Object class ?
     Answer ----->>>> Because this class is extended from Object class by default
     Reason --> Because in java every class is subclass of superclass Object
    */
    T[] arr = (T[]) new Object[10];
    int length = 0;
    public void append(T v) {
        arr[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++)
            System.out.println(arr[i]);
    }
}

// Subtype class which is also generic
class MyArray2 extends MyArray<String> {

}

public class MyArrayGenericDemo {
    public static void main(String[] args) {
        // MyArray<String> aar = new MyArray<>();
        
        // MyArray aar = new MyArray();
        // it will work perfectly because Object of class support every type

        /*-->> subtype object ---->>>*/
        MyArray2 aar = new MyArray2();  // ---->>> we don't need defined this as a generic because subclass also automatically generic
        aar.append("Khushwant");
        aar.append("Karan");
        aar.append("Harish");
        aar.append("Kiran");
        aar.display();

    }
}

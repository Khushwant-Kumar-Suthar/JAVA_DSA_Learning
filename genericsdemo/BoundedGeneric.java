package JAVA_DSA_Learning.genericsdemo;

@SuppressWarnings("unchecked")
class MyArrayBound<K extends Number> {
    /*
      Question-->> Why Number class object ? why not Object class ?
      Answer ----->>>> Because now this class is extended from Number class manually not by Object class default
     */
    private K[] arr = (K[]) new Number[5];
    private int length = 0;

    //    public MyArrayBound(int size){
//        arr = (K[])new Number[size];
//    }
    public void append(K value) {
        arr[length++] = value;
    }

    public void display() {
        for (int j = 0; j < length; j++) {
            System.out.println(arr[j]);
        }
    }
}

public class BoundedGeneric {
    public static void main(String[] args) {
        MyArrayBound<Float> arr = new MyArrayBound<>();
        arr.append(3.4f);
        arr.append(4.5f);
        arr.display();

    }
}

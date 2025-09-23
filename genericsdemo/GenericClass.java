package JAVA_DSA_Learning.genericsdemo;

class Data<T> {
    private T obj;

    public void setData(T v) {
        obj = v;
    }

    public T getData() {
        return obj;
    }
}

public class GenericClass {
    public static void main(String[] args){
        Data<String> d = new Data<>();
        d.setData("Khushwant");
        System.out.println(d.getData());
    }
}

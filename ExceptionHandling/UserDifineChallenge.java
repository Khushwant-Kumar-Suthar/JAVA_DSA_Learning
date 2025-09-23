package JAVA_DSA_Learning.ExceptionHandling;
class StackOverFlowException extends Exception{
    @Override
    public String toString() {
        // this is ansi code for color
        String redColor = "\u001B[31m"; // red color 31 black 30 orange 33
        String resetColor = "\u001B[0m";
        return redColor+"Error!!---> Stack is Full: "+resetColor;
    }
}
class SatckUnderFlowException extends Exception{
    @Override
    public String toString() {

        String redColor = "\u001B[31m";
        String resetColor = "\u001B[0m";
        return redColor+"Error!! ---> Stack is empty: "+resetColor;
    }
}
class Stack{
    private int size;
    private int top = -1;
    private int arr[];
    public Stack(int sz){
        size=sz;
        arr = new int[sz];
    }
    public void push(int x) throws StackOverFlowException{

            if (top == size - 1)
                throw new StackOverFlowException();
            top++;
            arr[top]= x;



    }
    public int pop() throws SatckUnderFlowException{
        int x = -1;
        if(top==-1)
            throw new SatckUnderFlowException();
        x = arr[top];
        top--;
        return x;

    }
}
public class UserDifineChallenge {
    public static void main(String[] args){
        Stack st = new Stack(5);
           // there are must handle the exception after throwing
        try {
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60); // it throws error
            System.out.println("Adding value in stack is successfully");
        }
        catch (StackOverFlowException e){
            System.out.println(e);
        }
        try {
            System.out.println("pop method call --> it gives last add value in stack ");
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
        }
        catch (SatckUnderFlowException e){
            System.out.println(e);
        }
    }
}

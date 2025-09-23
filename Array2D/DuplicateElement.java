package JAVA_DSA_Learning;

public class DuplicateElement {
    public static boolean arrayDuplicate(int [] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        int[] num = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(arrayDuplicate(num));
    }
}

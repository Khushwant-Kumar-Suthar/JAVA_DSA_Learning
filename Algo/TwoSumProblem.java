package JAVA_DSA_Learning.Algo;

import java.util.Arrays;

public class TwoSumProblem {
    public static int[] twoSum(int [] arr, int target){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 1 ;j<n;j++){
                if(arr[i]+arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,4};
        int target =  3;
        System.out.println("Index of target is: "+ Arrays.toString(twoSum(arr, target)));
    }
}

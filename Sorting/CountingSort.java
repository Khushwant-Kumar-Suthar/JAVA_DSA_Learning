package JAVA_DSA_Learning.Sorting;

import java.util.*;

public class CountingSort {
    public static void countSort(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0;i<n;i++){
            count[arr[i]]++;
        }
        // sorting
        int j =0;
        for(int i = 0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size of array is: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter a element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Unsorted array is ");
        printArr(arr);
        System.out.println("sorted array is ");
        countSort(arr,n);
        printArr(arr);
    }
}

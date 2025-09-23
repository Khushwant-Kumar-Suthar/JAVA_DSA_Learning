package JAVA_DSA_Learning.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr, int n) {
         for(int i =0 ;i<n-1;i++){
             int minPos = i; // lets current element is minimum
             for(int j = i+1;j<n;j++){
              if(arr[minPos]>arr[j]){
                  minPos = j;
              }
             }
             // swap
             int temp = arr[minPos];
             arr[minPos] = arr[i];
             arr[i] = temp;

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
        System.out.println("Enter a size of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter a array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Unsorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted array is: ");
        selectionSort(arr,n);
        printArr(arr);
    }
}

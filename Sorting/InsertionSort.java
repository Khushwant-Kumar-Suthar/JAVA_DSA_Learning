package JAVA_DSA_Learning.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out a currect position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
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
        insertionSort(arr, n);
        printArr(arr);
    }
}

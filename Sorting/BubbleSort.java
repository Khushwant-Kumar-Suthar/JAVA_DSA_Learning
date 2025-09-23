package JAVA_DSA_Learning.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubblesort(int[] arr, int n) {
        for (int turns = 0; turns < n - 1; turns++) {
            for (int j = 0; j < n - 1 - turns; j++) {  // for(int j = 0;j<=n-2-turns;j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void printarr(int[] arr) {
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
        bubblesort(arr, n);
        printarr(arr);
    }
}

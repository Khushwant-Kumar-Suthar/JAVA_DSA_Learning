package JAVA_DSA_Learning.Sorting;
import java.util.*;
public class InbuiltSort {
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
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // descending order
        Integer[] arr2  = new Integer[n];
        System.out.println("Enter a array element: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
        // this is not applied on primitive data type arr we want to create a object in Integer class so applied
        Arrays.sort(arr2,Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}

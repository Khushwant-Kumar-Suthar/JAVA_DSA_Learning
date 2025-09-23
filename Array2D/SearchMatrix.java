package JAVA_DSA_Learning.Array2D;

import java.util.Scanner;

public class SearchMatrix {

    // linear approach
    public static int linearSearch(int[][] matrix, int target) {
        System.out.println("Linear search approach with O(n^2) time complexity and Element index is :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Index of target element " + target + " is (" + i + "," + j + ")");
                    return 1;
                }
            }
        }
        System.out.println("Element not found so index is (-1,-1)");
        return 0;
    }

    // binary approach
    public static boolean staircaseSearch(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;  // start case from first row last element and left-bottom approach
        System.out.println("Binary search approach with O(nlogn) time complexity and Element index is :");
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Index of target element " + target + " is (" + row + "," + col + ")");
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else if (target > matrix[row][col]) {
                row++;
            }
        }
        System.out.println("Element not found so index is (-1,-1)");
        return false;
    }

    public static void printMatrix(int[][] arr) {
        System.out.println("Matrix is :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int n = in.nextInt(), m = in.nextInt(); // n = row -- m = column
        int[][] matrix = new int[n][m];
        System.out.println("Enter a matrix element : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        printMatrix(matrix);
        System.out.println("Enter a finding value: ");
        int key = in.nextInt();
        linearSearch(matrix, key);
        staircaseSearch(matrix, key);
    }
}

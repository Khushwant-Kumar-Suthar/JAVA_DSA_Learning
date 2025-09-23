package JAVA_DSA_Learning.Array2D;

import java.util.Scanner;

public class DiagonalSum {
    // brute force approach time complexity O(n^2)
    public static void diagonalSum(int[][] matrix) {
        int sum = 0;
        System.out.println("Matrix diagonal sum with brute force approach: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    // optimize approach with time complexity is O(n) and space complexity is O(1)
    public static void optimizeApproach(int[][] matrix) {
        int sum = 0;
        System.out.println("Matrix diagonal sum with optimize approach ");
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - i - 1];
        }
        System.out.println(sum);
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
        diagonalSum(matrix);
        optimizeApproach(matrix);
    }
}

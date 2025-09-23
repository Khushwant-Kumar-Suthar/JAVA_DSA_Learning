package JAVA_DSA_Learning.Array2D;

import java.util.Scanner;

public class locateKey {
    public static boolean search(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println(key + " Found at index (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println(key + " not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a row and column size: ");
        int n = in.nextInt(), m = in.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter a element for matrix");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = in.nextInt();
            }
        }
        System.out.println("matrix is ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter a key for search ");
        int key = in.nextInt();
        search(matrix, key);
    }
}

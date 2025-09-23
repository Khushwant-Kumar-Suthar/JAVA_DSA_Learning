package JAVA_DSA_Learning.Array2D;

import java.util.Scanner;

public class SpiralProblem {

    public static void spiralPattern(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        System.out.println("Spiral pattern output ");
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(matrix[startRow][col] + " ");
            }
            // right
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(matrix[row][endCol] + " ");
            }
            // bottom boundary
            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][col] + " ");
            }
            // left
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[row][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
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
        spiralPattern(matrix);
    }
}

package JAVA_DSA_Learning.Array2D;
import java.util.*;
public class CountKey {
    public static int countTarget(int[][] matrix, int key){
        int count = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==key)
                    count++;

            }
        }
        return count;
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
        System.out.println("Enter a key for search: ");
        int key = in.nextInt();
        System.out.println(key+" is repeat "+countTarget(matrix,key)+" times in a given matrix: ");
    }
}

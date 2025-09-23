package JAVA_DSA_Learning.Algo;

public class KadaneAlgorithm {
    public static void kadanes(int[] arr) {
        int currentSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }

            maxsum = Math.max(currentSum, maxsum);
        }
        System.out.println("Max subarray sum is : " + maxsum);

    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(arr);
    }
}

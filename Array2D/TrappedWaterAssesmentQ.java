package JAVA_DSA_Learning;

public class TrappedWaterAssesmentQ {
    // by using helper array
    public static int trappedWater(int[] arr) {
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        // fill the left max value
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        // fill the right max array
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }

    // by using variable
    public static int trapWater(int[] hight) {
        int n = hight.length;
        int l = 0, r = n - 1;
        int trappedWater = 0;
        int lMax = hight[l], rMax = hight[r];
        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(hight[l], lMax);
                trappedWater += lMax - hight[l];
            } else {
                r--;
                rMax = Math.max(rMax, hight[r]);
                trappedWater += rMax - hight[r];
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] hight = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Total trapped water " + trappedWater(hight));
        System.out.println("Total trapped water by using Approach2 " + trapWater(hight));
    }
}

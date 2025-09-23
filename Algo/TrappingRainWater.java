package JAVA_DSA_Learning.Algo;
// time complexity is O(n)
public class TrappingRainWater {
    public static int trappedWater(int[] hight) {
        // calculate left max boundary in array
        int[] leftMax = new int[hight.length];
        leftMax[0] = hight[0];
        for (int i = 1; i < hight.length; i++) {
            leftMax[i] = Math.max(hight[i], leftMax[i - 1]);
        }
        // calculate right max boundary in array form
        int[] rightMax = new int[hight.length];
        rightMax[hight.length - 1] = hight[hight.length - 1];
        for (int i = hight.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(hight[i], rightMax[i + 1]);
        }

        // loop run
        int trappedWater = 0;
        for (int i = 0; i < hight.length; i++) {
            // calculate water level = min(leftMax,rightMax)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = water level-hight;
            trappedWater += waterlevel - hight[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] hight = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total trapped water is "+trappedWater(hight));

    }
}

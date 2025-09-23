package JAVA_DSA_Learning.Bit_Manuplection;

public class binarySearch {
    public static int search(int[] nums, int target) {
        //min will have index of minimum element of nums
        int min = minSearch(nums);
        // find sorted left
        if (nums[min] <= target && target <= nums.length - 1) {
            return search(nums, min, nums.length - 1, target);
        }
        //find sorted right
        else
            return search(nums, 0, min, target);

    }

    // find a target search by using binary search left and right
    public static int search(int[] nums, int left, int right, int target) {
        int Left = left;
        int Right = right;
        while (Left <= Right) {
            int mid = Left + (Right - Left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                Right = mid - 1;
            } else
                Left = mid + 1;
        }
        return -1;

    }

    // smaller element search
    public static int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return left;
    }
    public static void main(String[] args){
        int[] arr ={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
}

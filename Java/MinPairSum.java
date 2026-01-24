// Leetcode : 1877

import java.util.Arrays;

public class MinPairSum {
    public int minPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1; 
        while (left < right){
            max = Math.max(max, (nums[left]+nums[right]));
            left++;
            right--;
        }
        return max;
    }
}

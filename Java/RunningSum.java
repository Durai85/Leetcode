// Leetcode : 1480
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int total = 0;
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            total += nums[i];
            result[i] = total;
        }
        return result;
    }
}

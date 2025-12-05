public class CourtPartitions {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;
        int count = 0;
        int left = 0;
        for(int i = 0; i<nums.length-1; i++){
            left += nums[i];
            int right = total - left;
            count += ((left - right) % 2 == 0 ) ? 1 : 0;
        }
        return count;
    }
}

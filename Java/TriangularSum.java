public class TriangularSum {
    public int triangularSum(int[] nums) {
        while(nums.length>1){
            int new_nums[] = new int[nums.length - 1];
            for(int i=0; i<nums.length-1; i++){
                new_nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            nums = new_nums;
        } 
        return nums[0];
    }
}
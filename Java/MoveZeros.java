// Leetcode : 283

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int position = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                // System.out.println(Arrays.toString(nums)+" "+position+" "+i);
                int temp = nums[position]; 
                nums[position] = nums[i];
                nums[i] = temp;
                position ++;
            }
        }
    }
}

// Revised Leetcode : 283
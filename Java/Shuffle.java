// Leetcode : 1470

public class Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];
        int count = n;
        for(int i=0; i < nums.length; i++){
            if(i%2==0){
                ans[i] = nums[i/2];
            }else{
                ans[i] = nums[count];
                count++;
            }
        }
        return ans;
    }
}

// Leetcode : 645

public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int n = nums.length;
        boolean seen[] = new boolean[n+1];
        int sum = 0;
        for(int num : nums){
            if(seen[num]){
                duplicate = num;
            }
            seen[num] = true;
            sum += num;
        }

        int total = n * (n+1)/2;
        return new int[]{duplicate, duplicate + (total - sum)};
    }
}

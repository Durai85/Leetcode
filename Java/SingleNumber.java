// Leetcode : 136

class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i=1; i<nums.length; i++){
            res = res ^ nums[i];    // xor operator
                                    // 0 ^ n = n
                                    // n ^ n = 0
        }
        return res;
    }
    public static void main(String arg[]){
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
}
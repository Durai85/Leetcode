class MinBitwiseArray {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for(int i=0; i<nums.size(); i++){
            if((nums.get(i) & 1)==0){
                ans[i] = -1;
            }else{
                int n = nums.get(i);
                ans[i] = n - ((n+1) & (-n-1)) / 2;
            }
        }
        return ans;
    }
}

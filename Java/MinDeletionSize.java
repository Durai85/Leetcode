// Leetcode : 994
class MinDeletionSize {
    public int minDeletionSize(String[] strs) {
        int fault = 0;
        int len = strs[0].length();
        for(int c = 0; c < len; c++){
            for(int r = 0; r < strs.length-1; r++){
                if(strs[r].charAt(c) > strs[r+1].charAt(c)){
                    fault++;
                    break;
                }
            }
        }
        return fault;
    }
}

// Leetcode : 3683
class Solution {
    public int earliestTime(int[][] tasks) {
        int sum = Integer.MAX_VALUE;
        for(int i=0; i<tasks.length; i++){
            int tempSum = tasks[i][0]+tasks[i][1];
            sum = Math.min(tempSum,sum);
        }
        return sum;
    }
}

// Revised Today (01 DEC 2025)
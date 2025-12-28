// Leetcode : 1351
public class CountNegative {
    public int countNegatives(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        for(int i = r-1; i>=0; i--){
            for(int j = c-1; j>=0; j--){
                if(grid[i][j]>=0) break;
                else count++;
            }
        }
        return count;
    }
}

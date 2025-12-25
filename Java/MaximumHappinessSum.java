// Leetcode : 3075

import java.util.Arrays;

public class MaximumHappinessSum {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res = 0;
        int i = happiness.length-1;
        int fac = 0;
        while(k > 0){
            int temp = happiness[i--] - fac++;
            if(temp < 0) break;
            else res+= temp;
            k--;
        }
        return res;
    }
}

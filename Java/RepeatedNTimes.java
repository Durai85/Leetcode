// Leetcode : 961

import java.util.HashSet;
import java.util.Set;

public class RepeatedNTimes {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int n : nums){
            if(!seen.add(n)) return n;
        }
        return 0;
    }
}

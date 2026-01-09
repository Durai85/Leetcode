// Leetcode : 128

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> track = new HashSet<>();
        for(int num : nums){
            track.add(num);
        }
        for(int num : track){
            if(!track.contains(num-1)){
                int current = num + 1;
                int streak = 1;
                while(track.contains(current)){
                    current++;
                    streak++;
                }
                max = Math.max(streak,max);
            }
        }
        return max;
    }
}

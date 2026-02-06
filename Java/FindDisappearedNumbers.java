// Leetcode : 448

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean found[] = new boolean[nums.length + 1];
        for(int num : nums){
            if(!found[num]){
                found[num] = true;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<found.length; i++){
            if(!found[i]){
                result.add(i);
            }
        }
        return result;
    }
}

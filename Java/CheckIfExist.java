// import java.util.HashMap;
import java.util.HashSet;
// import java.util.Map;
import java.util.Set;

public class CheckIfExist {
    // public static boolean checkIfExist(int[] nums){
    //     Map<Integer, Integer> seen = new HashMap<>();
    //     for(int i=0; i<nums.length; i++){
    //         seen.put(nums[i],i);
    //     }
    //     for(int i=0; i<nums.length; i++){
    //         int complement = nums[i]*2;
    //         if(seen.containsKey(complement) && i!=seen.get(complement)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public boolean checkIfExist(int[] nums) {
    Set<Integer> seen = new HashSet<>();
    for(int x : nums){
        if(seen.contains(2*x) || ((x % 2 == 0) && seen.contains(x/2))) return true;
        seen.add(x);
    }
    return false;
    }
}

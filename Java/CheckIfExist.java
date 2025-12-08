import java.util.HashMap;
import java.util.Map;

public class CheckIfExist {
    public static boolean checkIfExist(int[] nums){
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            seen.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            int complement = nums[i]*2;
            if(seen.containsKey(complement) && i!=seen.get(complement)){
                return true;
            }
        }
        return false;
    }
}

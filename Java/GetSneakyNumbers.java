import java.util.HashSet;
import java.util.Set;

public class GetSneakyNumbers {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2];
        int count = 0;
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(!seen.isEmpty() && seen.contains(num)){
                res[count++]=num;
            }else{
                seen.add(num);
            }
            if(count>=2) break;
        }
        return res;
    }
}

// Leetcode : 347

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Integer> bucket[] = new List[nums.length+1];

        for(int key : map.keySet()){
            int f = map.get(key);
            if(bucket[f]==null){
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(key);
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i=bucket.length-1; i>=0 && idx < k; i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    ans[idx++] = num;
                    if(idx == k) break;
                }
            }
        }
        return ans;
    }
}

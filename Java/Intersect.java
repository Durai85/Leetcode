// Leetcode : 350

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> count1 = new HashMap<>();
        Map<Integer,Integer> count2 = new HashMap<>();

        for(int n1 : nums1){
            count1.put(n1, count1.getOrDefault(n1, 0)+1);
        }
        for(int n2 : nums2){
            count2.put(n2, count2.getOrDefault(n2,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int n2 : nums2){
            if((count1.containsKey(n2)) && (count2.containsKey(n2))){
                int count = Math.min(count1.get(n2),count2.get(n2));
                while(count > 0){
                    list.add(n2);
                    count1.put(n2, count1.get(n2)-1);
                    count2.put(n2, count2.get(n2)-1);
                    count --;
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i=0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}

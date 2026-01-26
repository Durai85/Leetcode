// Leetcode : 1200

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i < arr.length -1; i++){
            int temp = arr[i+1] - arr[i];
            if(temp < min){
                min = temp;
                res.clear();
                res.add(new ArrayList<>(Arrays.asList(arr[i],arr[i+1])));
            }
            else if(temp == min){
                res.add(new ArrayList<>(Arrays.asList(arr[i],arr[i+1])));
            }
        }
        return res;
    }
}

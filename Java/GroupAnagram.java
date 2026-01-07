// Leetcode : 49 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] arr = new int[26];
            for(char c : str.toCharArray()){
                arr[c - 'a'] += 1;
            }

            StringBuilder hash = new StringBuilder();
            for(int i : arr){
                hash.append('.').append(i);
            }
            map.putIfAbsent(hash.toString(),new ArrayList<String>());
            map.get(hash.toString()).add(str);
        }
        List<List<String>> ans = new ArrayList<List<String>>();
        for(List<String>str : map.values()){
            ans.add(str);
        }
        return ans;
    }
}

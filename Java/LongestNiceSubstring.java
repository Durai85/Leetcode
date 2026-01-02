// Leetcode : 1763
import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public String longestNiceSubstring(String s){
        if(s.length() < 2)
            return "";

        Set<Character> charSet = new HashSet<>();
        for(char c : s.toCharArray()){
            charSet.add(c);
        }
        int len = s.length();
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(!charSet.contains(Character.toLowerCase(c)) || !charSet.contains(Character.toUpperCase(c))){
                String left = longestNiceSubstring(s.substring(0,i));
                String right = longestNiceSubstring(s.substring(i+1));

                return left.length() >= right.length() ? left : right;
            }
        }

        return s;
    }
}

// Leetcode : 744

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int max  = Integer.MAX_VALUE;
        char ans = ' ';
        for(char ch : letters){
            int diff = ch - target;
            // System.out.println(ch+" "+diff);
            if(diff > 0 && diff < max){
                max = diff;
                ans = ch;
            }
        }
        if(max == Integer.MAX_VALUE) return letters[0];
        return ans;
    }
}

// Leetcode : 58

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}

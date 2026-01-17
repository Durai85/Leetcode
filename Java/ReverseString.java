public class ReverseString {
    public void reverseString(char[] s) {
        int half = s.length / 2;
        for(int i=0,last=s.length-1; i<half; i++,last--){
            char temp = s[i];
            s[i] = s[last];
            s[last] = temp;
        }
    }
}
// Leetcode : 344
// Revised Today (17 JAN 2025)
// Leetcode : 557
public class ReverseWords {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder newString = new StringBuilder();
        for(String a : arr){
            char[] temp = a.toCharArray();
            for(int i=0; i<temp.length/2; i++){
                char t = temp[i];
                temp[i] = temp[temp.length - i - 1];
                temp[temp.length - i - 1] = t;
            }
            newString.append(new String(temp)).append(" ");
        }
        return newString.toString().trim();
    }
}

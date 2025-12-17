// Leetcode : 6
public class ZigzagConversion {
    public String convert(String s, int n) {
        if(n==1) return s;
        int len = s.length();
        int cycle = 2 * (n-1);
        
        StringBuilder ans = new StringBuilder();
        for(int row = 0; row < n; row++){
            for(int i = row; i < len; i+=cycle){
                ans.append(s.charAt(i));

                int diag = i + cycle - 2 * row;
                if(row != 0 && row != n-1 && diag < len){
                    ans.append(s.charAt(diag));
                }
            }
        }
        return ans.toString();
    }
}

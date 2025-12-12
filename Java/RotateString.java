public class RotateString {
    public boolean rotateString(String s, String goal) {
        int len1 = s.length();
        int len2 = goal.length();
        if(len1 != len2) return false;

        for(int i = 0; i < len1; i++){
            StringBuilder temp = new StringBuilder();
            temp.append(s.substring(i,len1));
            temp.append(s.substring(0,i));
            if(goal.equals(temp.toString())) return true;
        }
        return false;
    }
}

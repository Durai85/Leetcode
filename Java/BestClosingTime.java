// Leetcode : 2483
public class BestClosingTime {
    public static int bestClosingTime(String custormers){
        int penalty = 0;
        for(char c : custormers.toCharArray()){
            if(c=='Y') penalty++;
        }

        int minPenalty = penalty;
        int bestHour = 0;
        int len = custormers.length();
        for(int i = 0; i < len; i++){
            if(custormers.charAt(i)=='Y') penalty--;
            else penalty++;

            if(penalty < minPenalty){
                minPenalty = penalty;
                bestHour = i + 1;
            }
        }
        return bestHour;
    }
    
    public static void main(String arg[]){
        System.out.println(bestClosingTime(new String("YYNY")));
    }
}

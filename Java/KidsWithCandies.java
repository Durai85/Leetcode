import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int c : candies){
            max = c > max ? c : max;
        }
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            Boolean res = candies[i] + extraCandies >= max ? true : false;
            result.add(i,res);
        }
        return result;
    }
}

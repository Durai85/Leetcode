// Leetcode : 29
public class Divide {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        long res = 0;

        while(dvd >= dvs){
            long temp = dvs, multiple = 1;

            while(dvd >= (temp << 1)){
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            res += multiple;
        }

        boolean negative = (divisor < 0) ^ (dividend < 0);
        return negative ? (int) -res : (int) res;
    }
}

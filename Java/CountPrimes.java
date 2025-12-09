// Leetcode : 204
public class CountPrimes {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        int[] isPrime = new int[n];
        isPrime[0] = 0;
        isPrime[1] = 0;
        for(int x=2; x < n; x++) isPrime[x] = 1;

        for(int i=2; i*i < n; i++){
            if(isPrime[i]==1){
                for(int j = i*i; j < n; j+=i){
                    isPrime[j] = 0;
                }
            }
        }
        int count = 0;
        for(int t : isPrime){
            if(t==1) count++;
        }
        return count;
    }
}

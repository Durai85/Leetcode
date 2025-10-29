public class SmallestNumber{
    public static int smallestNumber(int n){
        int x = n;
        while((x & (x+1))!=0) x++;
        return x;
    }

    public static void main(String arg[]){
        System.out.println(smallestNumber(5));
    }
}
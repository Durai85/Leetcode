// Leetcode : 1929
public class GetConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] arr = new int[2*len];
        for(int i=0; i<arr.length; i++){
            arr[i] = nums[i%len];
        }
        return arr;
    }

    public static void main(String arg[]){
        int arr[] = getConcatenation(new int[]{1,2,3});
        for(int a:arr){
            System.out.println(a);
        }
    }
} 
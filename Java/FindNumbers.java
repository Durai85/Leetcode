public class FindNumbers {
    // public static int findNumbers(int[] nums) {
    //     int count=0;
    //     for(int num:nums){
    //         int temp = 0;
    //         while(num != 0){
    //             temp++;
    //             num /= 10;
    //         }
    //         if(temp % 2==0) count++;
    //     }
    //     return count;
    // }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            count += Math.floor(Math.log10(i)) % 2 != 0 ? 1 : 0; 
            System.out.println(count);
        }
        return count;
    }

    public static void main(String arg[]){
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
    }
}
// Revised Leetcode : 1295
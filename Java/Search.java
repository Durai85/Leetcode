// Leetcode : 33

public class Search {
    public int search(int[] nums, int target) {
        int ptr = 0;
        while(ptr < nums.length-1 && nums[ptr] < nums[ptr+1]) ptr++;
        int first = binarySearch(nums, 0, ptr, target);
        // System.out.println("Second");
        int second = binarySearch(nums, ptr+1, nums.length-1, target);
        // System.out.println(first+" "+second); 
        return first != -1 ? first : second;
    }

    private int binarySearch(int[] nums, int left, int right, int target){
        while(left<=right){
            int mid = left + (right - left)/2;
            // System.out.println(nums[mid]);
            if(nums[mid]==target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}

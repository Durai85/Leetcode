// Leetcode : 941
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;

        int i = 0;
        if(arr[i+1] < arr[i]) return false;
        while((i < arr.length - 1) && (arr[i + 1] > arr[i])) i++;
        if((i < arr.length - 1) && (arr[i] == arr[i+1])) return false;
        boolean flag = false;
        while((i < arr.length - 1) && (arr[i + 1] < arr[i])) {
            i++;
            flag = true;
        }
        if((i < arr.length - 1) && (arr[i] <= arr[i+1])) return false;
        return true & flag;
    }
}

// Leetcode : 75
public class SortColors {
    public void sortColors(int[] nums) {
        int len = nums.length;
        if(len < 2) return;

        int mid = len / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[len - mid];

        for(int i = 0; i < mid; i++){
            leftHalf[i] = nums[i];
        }
        for(int i = mid; i < len; i++){
            rightHalf[i - mid] = nums[i];
        }

        sortColors(leftHalf);
        sortColors(rightHalf);

        merge(nums, leftHalf, rightHalf);
    }

    private void merge(int[] arr, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0, j=0, k=0;

        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                arr[k++] = leftHalf[i++];
            }
            else{
                arr[k++] = rightHalf[j++];
            }
        }

        while(i < leftSize){
            arr[k++] = leftHalf[i++];
        }

        while(j < rightSize){
            arr[k++] = rightHalf[j++];
        }
    }
}

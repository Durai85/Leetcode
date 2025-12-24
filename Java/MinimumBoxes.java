// Leetcode: 3074
public class MinimumBoxes {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int apple_sum = 0;
        for(int a : apple) apple_sum += a;

        mergesort(capacity);
        int i = 0;
        int sum = 0;
        while(sum < apple_sum){
            sum += capacity[i++];
        }
        return i;
    }

    private static void mergesort(int[] arr){
        int len = arr.length;
        if(len < 2){
            return;
        }
        
        int mid = len / 2;
        int[] lefthalf = new int[mid];
        int[] righthalf = new int[len - mid];

        for(int i=0; i < mid; i++){
            lefthalf[i] = arr[i];
        }

        for(int i=mid; i < len; i++){
            righthalf[i - mid] = arr[i];
        }

        mergesort(lefthalf);
        mergesort(righthalf);

        merge(arr, lefthalf, righthalf);
    } 
    private static void merge(int[] arr, int[] lefthalf, int[] righthalf){
        int leftsize = lefthalf.length;
        int rightsize = righthalf.length;

        int i = 0, j = 0, k = 0;
        
        while(i < leftsize && j < rightsize){
            if(lefthalf[i] >= righthalf[j]){
                arr[k++] = lefthalf[i++];
            }
            else{
                arr[k++] = righthalf[j++];
            }
        }

        while(i < leftsize){
            arr[k++] = lefthalf[i++];
        }
        while(j < rightsize){
            arr[k++] = righthalf[j++];
        }
    }
}

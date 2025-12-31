// Leetcode : 832
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] i : image){
            int left = 0;
            int right = i.length - 1;
            while(left < right){
                int temp = i[left];
                i[left] = i[right];
                i[right] = temp;
                left++;
                right--;
            }
            for(int j = 0; j<i.length; j++){
                i[j] = i[j] == 0 ? 1 : 0;
            }
        }
        return image;
    }
}

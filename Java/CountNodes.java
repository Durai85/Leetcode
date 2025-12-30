// Leetcode : 222
public class CountNodes {
    public int countNodes(TreeNode root) {
        int leftHeight = countLeft(root);
        int rightHeight = countRight(root);

        if(leftHeight == rightHeight){
            return (1 << leftHeight) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int countLeft(TreeNode root){
        int height = 0;
        while(root != null){
            height ++;
            root = root.left;
        }
        return height;
    }

    private int countRight(TreeNode root){
        int height = 0;
        while(root != null){
            height++;
            root = root.right; 
        }
        return height;
    }
}

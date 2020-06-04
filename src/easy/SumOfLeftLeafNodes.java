package easy;

//import java.util.*;

public class SumOfLeftLeafNodes {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.data = x;
            this.left = this.right = null;
        }
    }

    public int getLeafNodesSum(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.data + getLeafNodesSum(root.right);

        } else {

            return getLeafNodesSum(root.left) + getLeafNodesSum(root.right);
        }
    }

}
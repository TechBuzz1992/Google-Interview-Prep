package easy;

public class PathSum {
    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int x) {
            this.data = x;
        }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null && sum - root.data == 0) {
            return true;
        } else {
            return hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum - root.data);
        }
    }

    public static void main(String[] args) {

    }

}
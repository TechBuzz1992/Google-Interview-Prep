package medium;

public class KthSmallestBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
            this.left = this.right = null;
        }
    }

    public int getKthSmallest(TreeNode root, int k) {
        int[] nums = new int[2];
        inorder(root, k, nums);
        return nums[1];
    }

    public void inorder(TreeNode root, int k, int[] nums) {
        if (root == null) {
            return;
        }

        inorder(root.left, k, nums);
        if (++nums[0] == k) {
            nums[1] = root.val;
            return;
        }
        inorder(root.right, k, nums);

    }

    public static void main(String[] args) {

    }

}
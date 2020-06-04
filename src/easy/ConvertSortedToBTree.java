package easy;

public class ConvertSortedToBTree {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.data = x;
            this.left = this.right = null;
        }

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return constructBST(nums, 0, nums.length - 1);

    }

    public TreeNode constructBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode current = new TreeNode(mid);

        current.left = constructBST(nums, left, mid - 1);
        current.right = constructBST(nums, mid + 1, right);

        return current;

    }

}
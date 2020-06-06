package medium;

public class BTLongestConsecutiveSubsequence {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {

    }

    public int longestConsecutive(TreeNode root) {
        int[] max = new int[1];
        findLongestConsecutiveSequence(root, 0, 0, max);
        return max[0];

    }

    public void findLongestConsecutiveSequence(TreeNode root, int count, int target, int[] max) {
        if (root == null) {
            return;
        } else if (root.val == target) {
            count++;

        } else {
            count = 1;
        }

        max[0] = Math.max(max[0], count);
        findLongestConsecutiveSequence(root.left, count, root.val + 1, max);
        findLongestConsecutiveSequence(root.right, count, root.val + 1, max);

    }

}
package easy;

import java.util.*;

public class RangeSumBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
            this.left = this.right = null;
        }
    }

    public int getRangeSum(TreeNode root, int l, int r) {
        int sum = 0;
        if (root == null) {
            return sum;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.val >= l && current.val <= r) {
                sum += current.val;
            }

            if (current.left != null && current.val > l) {
                queue.add(current.left);
            }

            if (current.right != null && current.val < r) {
                queue.add(current.right);
            }
        }

        return sum;

    }

    public static void main(String[] args) {

    }

}
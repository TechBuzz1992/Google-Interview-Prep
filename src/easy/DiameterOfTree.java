package easy;

import java.util.*;

public class DiameterOfTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
            this.left = this.right = null;
        }
    }

    public int getDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = 0;
        while (!queue.isEmpty()) {
            max = Math.max(max, queue.size());
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return max;

    }

}
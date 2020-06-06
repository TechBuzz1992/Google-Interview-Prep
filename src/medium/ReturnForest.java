package medium;

import java.util.*;

public class ReturnForest {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.data = x;
            this.left = this.right = null;
        }
    }

    public List<TreeNode> returnRoots(TreeNode root, int[] to_delete) {
        List<TreeNode> remaining = new ArrayList<>();
        if (root == null) {
            return remaining;
        }
        Set<Integer> toDelete = new HashSet<>();
        for (int i : to_delete) {
            toDelete.add(i);
        }

        removeNodes(root, toDelete, remaining);

        if (!toDelete.contains(root.data)) {
            remaining.add(root);
        }

        return remaining;

    }

    public TreeNode removeNodes(TreeNode root, Set<Integer> toDelete, List<TreeNode> remaining) {
        if (root == null) {
            return null;
        }

        root.left = removeNodes(root.left, toDelete, remaining);
        root.right = removeNodes(root.right, toDelete, remaining);

        if (toDelete.contains(root.data)) {
            if (root.left != null) {
                remaining.add(root.left);
            }
            if (root.right != null) {
                remaining.add(root.right);
            }

            return null;
        }

        return root;

    }

    public static void main(String[] args) {

    }

}
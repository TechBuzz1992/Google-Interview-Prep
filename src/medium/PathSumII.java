package medium;

import java.util.*;

public class PathSumII {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.data = x;
            this.left = this.right = null;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        findPaths(root, sum, new ArrayList<Integer>(), paths);

        return paths;

    }

    public void findPaths(TreeNode root, int sum, ArrayList<Integer> current, List<List<Integer>> paths) {
        if (root == null) {
            return;
        }
        current.add(root.data);

        if (root.data == sum && root.left == null && root.right == null) {
            paths.add(current);
            return;
        }

        findPaths(root.left, sum - root.data, new ArrayList<Integer>(current), paths);
        findPaths(root.right, sum - root.data, new ArrayList<Integer>(current), paths);

    }

    public static void main(String[] args) {

    }

}
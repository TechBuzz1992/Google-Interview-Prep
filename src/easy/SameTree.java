package easy;

public class SameTree {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.data = x;
            this.left = this.right = null;
        }
    }

    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null) {
            return false;
        } else if (s.data != t.data) {
            return false;
        } else {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        }
    }

}
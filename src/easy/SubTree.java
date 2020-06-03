package easy;

public class SubTree {
    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int x) {
            this.val = x;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {

    }

    public boolean isSubTree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        } else if (isSameTree(s, t)) {
            return true;
        } else {
            return isSameTree(s.left, t) || isSameTree(s.right, t);
        }
    }

    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return s == null && t == null;
        }

        else if (s.val == t.val) {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);

        } else {
            return false;
        }
    }

}
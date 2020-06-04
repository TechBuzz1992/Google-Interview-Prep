package easy;

public class LCABST {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.data = x;
            this.left = this.right = null;

        }
    }

    public int getLCA(TreeNode root, int s, int t) {
        if (s < root.data && t < root.data) {
            return getLCA(root.left, s, t);
        } else if (s > root.data && t > root.data) {
            return getLCA(root.right, s, t);
        } else {
            return root.data;

        }
    }

}
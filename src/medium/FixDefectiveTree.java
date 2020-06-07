package medium;

import java.util.*;

public class FixDefectiveTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
            this.left = this.right = null;
        }
    }

    public void fixTree(TreeNode root) {
        if (root == null) {
            return;
        }

        fixBST(root, new HashSet<TreeNode>());

    }

    public void fixBST(TreeNode root, Set<TreeNode> visited) {
        if(root == null){
            return;
        }

        if(root.left!=null){
            if(visited.contains(root.left)){
                System.out.println("Found defective : " + root.left.val);
                root.left = null;
            }
            else{
                visited.add(root.left);
                fixBST(root.left, visited);

            }
        }

        if(root.right!=null){
            if(visited.contains(root.right)){
                System.out.println("Found Defective: " + root.right.val);
                root.right = null;
            }
            else{
                visited.add(root.right);
                fixBST(root.right, visited);
            }
        }

    }

}
package easy;

import java.util.*;

public class BinaryTreePaths {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
            this.left = this.right = null;

        }
    }

    public List<String> getAllTreePaths(TreeNode root){
        List<String> paths = new LinkedList<String>();

        if(root == null){
            return paths;
        }

        dfs(root, "", paths);

        return paths;
    }

    public void dfs(TreeNode root, String path, List<String> paths){
        path += root.val;

        if(root.left == null && root.right == null){
            paths.add(path);
            return;
        }

        if(root.left!=null){
            dfs(root.left,path+"->",paths);
        }
        if(root.right!=null){
            dfs(root.right,path+"->",paths);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(2);

        BinaryTreePaths obj = new BinaryTreePaths();

        List<String> paths = obj.getAllTreePaths(root);

        for(String s: paths){
            System.out.println(s);
        }

    }



}
package medium;

import java.util.*;

public class NAryTreePreOrderTraversal {
    static class TreeNode{
        int val;
        List<TreeNode> children;

        TreeNode(int x){
            this.val = x;
            this.children = new ArrayList<>();
        }
    }

    public List<Integer> getPreOPrderTraversal(TreeNode root){
        List<Integer> nodes = new ArrayList<>();
        if(root == null){
            return nodes;
        }
        preOrderTraversal(root,nodes);
        return nodes;

    }

    public void preOrderTraversal(TreeNode root,List<Integer> nodes){
        if(root == null){
            return;
        }
        nodes.add(root.val);
        for(TreeNode node : root.children){
            preOrderTraversal(node, nodes);
        }

    }

    public static void main(String[] args) {
        
    }
    
}
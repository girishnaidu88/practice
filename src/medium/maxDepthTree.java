package medium;

import java.util.*;

public class maxDepthTree {

    public static class TreeNode{
        int data;
        TreeNode left, right;

        TreeNode(){

        }

        TreeNode(int d){
            data=d;
        }

        TreeNode(int d, TreeNode l, TreeNode r){
            data=d; left=l; right=r;
        }

    }




    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }

        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);

        return 1+Math.max(lh, rh);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.left=new TreeNode(9);

        System.out.println("The max depth of the tree is: "+maxDepth(root));
    }

}

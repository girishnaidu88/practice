package medium;

import java.sql.*;

public class MaxPathSumTree {

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

    public static void maxPathSum(TreeNode root){

        int[] maxSum=new int[1];
        height(root, maxSum);
        System.out.println("The max sum is: "+maxSum[0]);
    }

    public static int height(TreeNode node, int[] maxSum){
        if(node==null){
            return 0;
        }

        int ls=height(node.left, maxSum);
        int rs=height(node.right, maxSum);

        maxSum[0]=Math.max(maxSum[0], node.data+ls+rs);
        return node.data+ Math.max(ls, rs);
    }



    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(-3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.left=new TreeNode(9);
        root.right.right.left.left=new TreeNode(8);

        maxPathSum(root);
    }

}

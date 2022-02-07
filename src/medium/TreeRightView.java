package medium;

import java.util.*;

public class TreeRightView {

    public static class TreeNode{
        int data;
        TreeNode left, right;

        TreeNode(){ }
        TreeNode(int d){
            data=d;
        }
        TreeNode(int d, TreeNode l, TreeNode r){
            data=d; left=l; right=r;
        }

    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        System.out.println(rightSideView(root));
    }

    static List<Integer> rightView=new ArrayList<>();

    public static List<Integer> rightSideView(TreeNode root){
        if(root==null){
            return rightView;
        }

        dfs(root, 0);
        return rightView;
    }

    public static void dfs(TreeNode node, int level){

        if(level==rightView.size()){
            rightView.add(node.data);
        }

        if(node.right!=null){
            dfs(node.right, level+1);
        }

        if(node.left!=null){
            dfs(node.left, level+1);
        }
    }
}

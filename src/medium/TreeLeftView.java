package medium;

import java.util.*;

public class TreeLeftView {

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

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        System.out.println(leftSideView(root));
    }

    static int maxLevel=0;
    static List<Integer> leftView=new ArrayList<>();

    public static List<Integer> leftSideView(TreeNode root){

        dfs(root, 1);
        return leftView;
    }

    public static void dfs(TreeNode node, int level){

        if(node==null){
            return;
        }

        if(maxLevel < level){
            leftView.add(node.data);
            maxLevel=level;
        }

        dfs(node.left, level+1);
        dfs(node.right, level+1);

    }
}

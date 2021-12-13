package medium;

import java.util.*;

public class DFSPreInPostTraversal_Iterative {

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


    public static List<Integer> preOrderIter(TreeNode root){

        List<Integer> preOrder= new ArrayList<>();
        if(root==null){
            return preOrder;
        }

        Stack<TreeNode> st=new Stack<TreeNode>();

        st.push(root);

        while(!st.isEmpty()){
            root=st.pop();
            preOrder.add(root.data);

            if(root.right!=null){
                st.push(root.right);
            }

            if(root.left!=null){
                st.push(root.left);
            }

        }

        System.out.println("PreOrder");
        return preOrder;

    }

    public static List<Integer> inOrderIter(TreeNode root){

        List<Integer> inOrder=new ArrayList<>();
        Stack<TreeNode> st= new Stack<TreeNode>();
        TreeNode node=root;

        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }

                node=st.pop();
                inOrder.add(node.data);
                node=node.right;
            }
        }

        System.out.println("InOrder");
        return inOrder;
    }


    public static List<Integer> postOrderIter(TreeNode root){
        List<Integer> postOrder=new ArrayList<>();
        Stack<TreeNode> st1=new Stack<TreeNode>();
        Stack<TreeNode> st2=new Stack<TreeNode>();

        if(root==null){
            return postOrder;
        }

        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.push(root);
            if(root.left!=null){
                st1.push(root.left);
            }
            if(root.right!=null){
                st1.push(root.right);
            }
        }

        while(!st2.isEmpty()){
            postOrder.add(st2.pop().data);
        }

        System.out.println("PostOrder");
        return postOrder;
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

        System.out.println(preOrderIter(root));
        System.out.println();
        System.out.println(inOrderIter(root));
        System.out.println();
        System.out.println(postOrderIter(root));
        System.out.println();
        System.out.println("The max depth of the tree is: "+maxDepth(root));
    }

}

package trees;

import java.util.*;

public class BinaryTreeInorder {

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
        }
    }

    public static TreeNode createBrinaryTree(){
        TreeNode rootNode=new TreeNode(40);
        TreeNode node20=new TreeNode(20);
        TreeNode node10=new TreeNode(10);
        TreeNode node30=new TreeNode(30);
        TreeNode node60=new TreeNode(60);
        TreeNode node50=new TreeNode(50);
        TreeNode node70=new TreeNode(70);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        return rootNode;
    }

    public void preOrderTraversalRecursive(TreeNode root){
        if(root!=null){
            System.out.printf("%d ", root.data);
            preOrderTraversalRecursive(root.left);
            preOrderTraversalRecursive(root.right);
        }
    }

    public void inOrderRecursive(TreeNode root){
        if(root!=null){
            inOrderRecursive(root.left);
            System.out.printf("%d ", root.data);
            inOrderRecursive(root.right);
        }
    }

    public void inOrderIterative(TreeNode root){
        if(root==null){
            return;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode currNode=root;

        while(!stack.isEmpty() || currNode!=null){

            if(currNode!=null){
                stack.push(currNode);
                currNode=currNode.left;
            }else{
                TreeNode n= stack.pop();
                System.out.printf("%d ", n.data);
                currNode=n.right;
            }

        }

    }

    public void preOrderTraversalIterative(TreeNode root){
        if(root == null)
            return;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.empty()){

            TreeNode n = stack.pop();
            System.out.printf("%d ",n.data);

            if(n.right != null){
                stack.push(n.right);
            }
            if(n.left != null){
                stack.push(n.left);
            }

        }
    }

    public void postOrderRecursive(TreeNode root){
        if(root!=null){
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.printf("%d ", root.data);
        }
    }

    public void postOrderIterative(TreeNode root){
        if(root==null){
            return;
        }

        Stack<TreeNode> s=new Stack<TreeNode>();
        TreeNode currNode=root;

        while(!s.isEmpty() || currNode!=null){



        }
    }


    public void printLeafNodes(TreeNode root){
        if(root==null){
            return;
        }

        if(root.left==null && root.right==null){
            System.out.printf("%d ", root.data);

        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);

    }

    public int leafNodesCount(TreeNode root){

        if(root==null){
            return 0;
        }

        if(root.left==null && root.right==null){
            return 1;
        }else{
            return leafNodesCount(root.left)+leafNodesCount(root.right);
        }
    }

    public void printBoundaynodes(TreeNode root){
        if(root==null){
            return;
        }

        if(root.left==null && root.right==null){
            return;
        }

        System.out.print(root.data+" ");

        if(root.left==null){
            printBoundaynodes(root.right);
        }else{
            printBoundaynodes(root.left);
        }

    }



    public static void main(String[] args) {
        BinaryTreeInorder bin=new BinaryTreeInorder();
        TreeNode node=bin.createBrinaryTree();

        System.out.println("The recursive method of perOrder Traversal");
        bin.preOrderTraversalRecursive(node);
        System.out.println();
        System.out.println("The Iterative method of perOrder Traversal");
        bin.preOrderTraversalIterative(node);

        System.out.println();
        System.out.println("The Recursive method of inOrder Traversal");
        bin.inOrderRecursive(node);
        System.out.println();
        System.out.println("The Iterative method of inOrder Traversal");
        bin.inOrderIterative(node);

        System.out.println();
        System.out.println("The Recursive method of postOrder Traversal");
        bin.postOrderRecursive(node);


        System.out.println();
        System.out.println("The Recursive method print leaf nodes");
        bin.printLeafNodes(node);

        System.out.println();
        int leafCount=bin.leafNodesCount(node);
        System.out.println("The leaf nodes count: "+leafCount);


        System.out.println();
        System.out.println("The Recursive method print boundary nodes");
        bin.printBoundaynodes(node);
    }

}

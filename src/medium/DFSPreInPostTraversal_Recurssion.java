package medium;

public class DFSPreInPostTraversal_Recurssion {

    public static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(){

        }

        TreeNode(int val){
            this.val=val;
        }

        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    //PreOrder: Root, Left, Right
    public static void preOrder(TreeNode node){
        if(node==null){
            return;
        }

        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }


    //InOrder: left, root, right
    public static void inOrder(TreeNode node){
        if(node==null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);

    }

    //PostOrder: left, right, root
    public static void postOrder(TreeNode node){
        if(node==null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");

    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }

}

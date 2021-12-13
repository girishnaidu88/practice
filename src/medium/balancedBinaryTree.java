package medium;

public class balancedBinaryTree {

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


    public static boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }

        int lh=height(root.left);
        int rh=height(root.right);

        if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }

        return false;
    }


    static int height(TreeNode node){
        if(node==null){
            return 0;
        }

        return 1+ Math.max(height(node.left), height(node.right));
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
//        root.right.right.left.left=new TreeNode(8);

        System.out.println("The give tree is balanced: "+isBalanced(root));
    }

}

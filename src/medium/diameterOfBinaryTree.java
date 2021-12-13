package medium;

public class diameterOfBinaryTree {

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

//    static int diameter=0;

    public static void diaOfTree(TreeNode root){

        int[] diameter= new int[1];
        System.out.println("The value returned is: "+height(root, diameter));
        System.out.println("The diameter of the tree is: "+ diameter[0]);
    }

    public static int height(TreeNode node, int[] diameter){
        if(node==null){
            return 0;
        }

        int lh=height(node.left, diameter);
        int rh=height(node.right, diameter);

        diameter[0]= Math.max(diameter[0], lh+rh);

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
        root.right.right.left.left=new TreeNode(8);

        diaOfTree(root);
    }

}

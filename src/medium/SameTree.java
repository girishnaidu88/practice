package medium;

public class SameTree {

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

    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }

        return p.data==q.data && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

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

        TreeNode root2=new TreeNode();
        TreeNode root3=new TreeNode();

        TreeNode root1=new TreeNode(1);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(-3);
        root1.left.left=new TreeNode(4);
        root1.left.right=new TreeNode(5);
        root1.right.left=new TreeNode(6);
        root1.right.right=new TreeNode(7);
        root1.right.right.left=new TreeNode(9);
        root1.right.right.left.left=new TreeNode(8);

        if(isSameTree(root, root1)){
            System.out.println("Trees are same");
        }else{
            System.out.println("Trees are NOT same");
        }

        if(isSameTree(root, root2)){
            System.out.println("Trees are same");
        }else{
            System.out.println("Trees are NOT same");
        }

        if(isSameTree(root2, root3)){
            System.out.println("Trees are same");
        }else{
            System.out.println("Trees are NOT same");
        }

    }

}

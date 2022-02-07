package medium;

public class RangeSumOfBST {

    public static class TreeNode{
        int data;
        TreeNode left, right;

        TreeNode(){}
        TreeNode(int d){
            data=d;
        }
        TreeNode(int d,TreeNode l, TreeNode r){
            data=d; left=l; right=r;
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(15);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(7);
        root.right.left=new TreeNode();
        root.right.right=new TreeNode(18);

        System.out.println(findRange(root, 7,15));

    }

    static int ans;

    public static int findRange(TreeNode root, int l, int r){
        ans=0;
        dfs(root, l, r);
        return ans;
    }

    public static void dfs(TreeNode node, int l, int r){
        if(node!=null){
            if(l <= node.data && node.data <= r){
                ans=ans+node.data;
            }

            if(l < node.data){
                dfs(node.left, l,r);
            }

            if(node.data < r){
                dfs(node.right, l, r);
            }
        }
    }


}

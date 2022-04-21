package google;

import java.util.*;



public class FindAllLeavesOfaTree {

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

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


    static List<List<Integer>> solution=new ArrayList<>();

    static List<List<Integer>> findLeaves(TreeNode root){

//        this.solution=new ArrayList<>();
        getHeight(root);

        return solution;
    }

    static int getHeight(TreeNode root){

        if(root==null){
            return -1;
        }

        int leftHeight= getHeight(root.left);
        int rightHeight=getHeight(root.right);

        int currHeight= Math.max(leftHeight, rightHeight)+1;

        if(solution.size()==currHeight){
            solution.add(new ArrayList<>());
        }

        solution.get(currHeight).add(root.val);

        return currHeight;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        FindAllLeavesOfaTree fl=new FindAllLeavesOfaTree();

        System.out.println(fl.findLeaves(root));
    }

    //Time: O(N)
    //Space: O(N)

}

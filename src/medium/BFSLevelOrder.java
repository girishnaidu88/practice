package medium;

import java.util.*;

public class BFSLevelOrder {

    public static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(){

        }
        TreeNode(int _val){
            val=_val;
        }
        TreeNode(int _val, TreeNode _left, TreeNode _right){
            val=_val;
            left=_left;
            right=_right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        List<List<Integer>> wrapList=new LinkedList<List<Integer>>();


        queue.offer(root);

        while(!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer> subList=new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++){
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }

        return wrapList;
    }

    public static void main(String[] args){
        BFSLevelOrder bfs=new BFSLevelOrder();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        System.out.println(bfs.levelOrder(root));
    }

}

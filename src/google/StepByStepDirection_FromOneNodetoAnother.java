package google;

public class StepByStepDirection_FromOneNodetoAnother {

    static class TreeNode{
        TreeNode left, right;
        int val;

        TreeNode(){}
        TreeNode(int val){
            this.val=val;
        }

        TreeNode(TreeNode left, TreeNode right, int val){
            this.left=left;
            this.right=right;
            this.val=val;
        }

    }

    private boolean find(TreeNode n, int val, StringBuilder sb) {
        if (n.val == val)
            return true;
        if (n.left != null && find(n.left, val, sb))
            sb.append("L");
        else if (n.right != null && find(n.right, val, sb))
            sb.append("R");
        return sb.length() > 0;
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder(), d = new StringBuilder();
        find(root, startValue, s);
        find(root, destValue, d);
        int i = 0, max_i = Math.min(d.length(), s.length());
        while (i < max_i && s.charAt(s.length() - i - 1) == d.charAt(d.length() - i - 1))
            ++i;
        return "U".repeat(s.length() - i) + d.reverse().toString().substring(i);
    }



}

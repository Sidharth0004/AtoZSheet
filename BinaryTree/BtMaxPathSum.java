public class BtMaxPathSum {
    private int maxPath = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxPath;
    }
    public  int helper(TreeNode root){
       
        if(root == null){
            return 0;
        }

        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
   
     maxPath = Math.max(maxPath , left+right+root.val);

        return root.val + Math.max(left, right);
    }
}

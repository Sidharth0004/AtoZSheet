class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class diameter {
    
     public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

   int lh =  maxDepth(root.left);
   int rh =   maxDepth(root.right);
   return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
          if (root == null) {
            return 0;
        }

        int leftDiam = diameterOfBinaryTree(root.left);
        int leftHeight =  maxDepth(root.left);
        int rightDiam = diameterOfBinaryTree(root.right);
        int rightHeight =  maxDepth(root.right);

        int selfDiam = leftHeight + rightHeight +1;
        return  Math.max(selfDiam , Math.max(rightDiam, leftDiam));
    }

                                  //! OR


    // private int maxDiameter = 0;
    
    // public int diameterOfBinaryTree(TreeNode root) {
    //     dfs(root);
    //     return maxDiameter;
    // }
    
    // private int dfs(TreeNode node) {
    //     if (node == null) return 0;
        
    //     int left = dfs(node.left);
    //     int right = dfs(node.right);
        
    //     maxDiameter = Math.max(maxDiameter, left + right);
        
    //     return Math.max(left, right) + 1;
    // }
}

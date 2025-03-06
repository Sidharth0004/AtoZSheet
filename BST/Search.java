public class Search {
    public TreeNode searchBST(TreeNode root, int val) {
        
        while(root != null && root.val != val){
            root = val<root.val?root.left : root.right;
        }
        return root;
    }




    // public TreeNode searchBST(TreeNode root, int key) {
        
    //     if (root == null) {
    //         return null;
    //     }
    //     if (root.val == key) {
    //         return root;
    //     } if (root.val>key) {
    //         return searchBST(root.left, key);
    //     }
    //     else{
    //         return searchBST(root.right, key);
    //     }
        
    // }


}

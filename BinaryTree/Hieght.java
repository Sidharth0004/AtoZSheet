import javax.swing.tree.TreeNode;

/**
 * Hieght
 */
public class Hieght {

     public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

   int lh =  maxDepth(root.left);
   int rh =   maxDepth(root.right);
   return Math.max(lh,rh)+1;
    }
}


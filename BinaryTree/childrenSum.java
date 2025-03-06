import org.w3c.dom.Node;

public class childrenSum {
        public static int isSumProperty(Node root)
    {
        // add your code here
        if (root == null ||(root.left == null && root.right == null)) return 1;
        
        int sum = 0 ;
         
         if(root.left != null)
         sum += root.left.data;
         
         if(root.right != null)
         sum += root.right.data;
         
            return ((root.data == sum)
                && (isSumProperty(root.left) == 1)
                && (isSumProperty(root.right) == 1))
                ?
                1:0;
         
        
    }
    public void changeTree(TreeNode root) {
        // Base case: If the current node
        // is null, return and do nothing.
        if (root == null) {
            return;
        }

        // Calculate the sum of the values of
        // the left and right children, if they exist.
        int child = 0;
        if (root.left != null) {
            child += root.left.val;
        }
        if (root.right != null) {
            child += root.right.val;
        }

        // Compare the sum of children with
        // the current node's value and update
        if (child >= root.val) {
            root.val = child;
        } else {
            // If the sum is smaller, update the
            // child with the current node's value.
            if (root.left != null) {
                root.left.val = root.val;
            } else if (root.right != null) {
                root.right.val = root.val;
            }
        }

        // Recursively call the function
        // on the left and right children.
        changeTree(root.left);
        changeTree(root.right);

        // Calculate the total sum of the
        // values of the left and right
        // children, if they exist.
        int tot = 0;
        if (root.left != null) {
            tot += root.left.val;
        }
        if (root.right != null) {
            tot += root.right.val;
        }

        // If either left or right child
        // exists, update the current node's
        // value with the total sum.
        if (root.left != null || root.right != null) {
            root.val = tot;
        }
    }

}

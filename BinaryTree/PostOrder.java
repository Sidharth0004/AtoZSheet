import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class PostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> list = new ArrayList<>();
      helper(root, list);
      return list;  
    }

    public static void helper(TreeNode root , List<Integer> list ){
        if(root == null){
        return;
        }

       helper(root.left ,  list);
       helper(root.right, list);
       list.add(root.val);


    } 
}

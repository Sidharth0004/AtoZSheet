import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    //  List<List<<Integer>> ans = new LinkedList<>();
       List<List<Integer>> ans = new ArrayList<>();
     if(root == null){
        return ans;
     }

     Queue<TreeNode> q = new LinkedList<>();

     q.add(root);
   
  while(!q.isEmpty()){
    int size = q.size();
      List<Integer> level = new ArrayList<>();

      for(int i =0 ; i<size ; i++){
         TreeNode currNode = q.remove();
         level.add(currNode.val);

         if(currNode.left!= null){
            q.add(currNode.left);
         }
          if(currNode.right!= null){
            q.add(currNode.right);
         }
   
 

      }

  ans.add(level);
  }


 return ans;


    } 
}

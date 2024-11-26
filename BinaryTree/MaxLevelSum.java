import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class MaxLevelSum {
     public int maxLevelSum(TreeNode root) {
       int level = 1;
       ArrayList<Integer> list = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
 int maxsum=Integer.MIN_VALUE;
  int ans=0;
       while(!q.isEmpty()){
        int size = q.size();
        int sum = 0;

      for(int i = 0 ; i<size ; i++){
        TreeNode curr = q.remove();
        sum += curr.val;
   if(curr.left!= null){
            q.add(curr.left);
         }
          if(curr.right!= null){
            q.add(curr.right);
         }
        
      }

   if(sum>maxsum)
            {
                maxsum=sum;
                ans=level;
            }
            level++;


       }

       return ans;


    }
}

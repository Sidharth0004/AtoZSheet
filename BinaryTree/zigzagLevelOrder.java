import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzagLevelOrder {

     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return res;

       q.add(root);
       int level =0 ;
       while(!q.isEmpty()){
        ArrayList<Integer> temp = new ArrayList<>();
       int size = q.size();
       
       for(int i = 0 ; i<size ; i++){
        TreeNode node = q.poll();
        temp.add(node.val);

        if(node.left != null) q.add(node.left);
        if(node.right != null) q.add(node.right);


       }

       if(level%2!= 0){
        res.add(new ArrayList<>());
        for(int i= temp.size()-1 ; i>=0 ; i--)
        res.get(level).add(temp.get(i));
       }
       else
       res.add(temp);

       level ++;

       }   
  
 return res;
    }
}
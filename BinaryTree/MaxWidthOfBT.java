import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBT {
        public class Pair{
        TreeNode node ;
        int num;

         Pair(TreeNode _node , int _num){
            node=_node;
            num = _num;
         }
    }
    public int widthOfBinaryTree(TreeNode root) {
         if(root == null) return 0;
         int ans = 0;
         Queue<Pair> q = new LinkedList<>();
         q.offer(new Pair(root , 0));

         while(!q.isEmpty()){
            int size = q.size();
            int mmin = q.peek().num;
            int first =  0;
            int last = 0;
            for(int i = 0 ; i< size ; i++){
                int curr_id = q.peek().num -mmin;
                TreeNode curr_node = q.peek().node;
                q.poll();
                if(i == 0) first= curr_id;
                if(i == size-1) last= curr_id;
                if(curr_node.left != null) {
                   q.offer(new Pair(curr_node.left , 2*curr_id +1));
                }
                 if(curr_node.right != null) {
                   q.offer(new Pair(curr_node.right , 2*curr_id +2));
                }


            }
               ans = Math.max(ans , last-first+1);
         }
return ans;

    }
}

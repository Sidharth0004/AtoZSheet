package BinaryTreeHard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import javax.swing.tree.TreeNode;

// All Nodes Distance K in Binary Tree
public class AllNodeDisK {
    public void markParents(TreeNode node , Map<TreeNode , TreeNode> parent_track){
        Queue<TreeNode> q = new LinkedList<>();
         q.offer(node);
         while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left != null){
                   parent_track.put(curr.left , curr);
                   q.offer(curr.left);
            }
             if(curr.right != null){
                   parent_track.put(curr.right , curr);
                   q.offer(curr.right);
            }

         }


    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
       Map<TreeNode , TreeNode> parent_track = new HashMap<>(); 
       markParents(root , parent_track);
    Map<TreeNode , Boolean> vis = new HashMap<>(); 
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(target);
       vis.put(target , true);
       int count = 0 ;

       while(!q.isEmpty()){
        int size = q.size();
        if(count == k){
            break;
        }
      count++;
      for(int i = 0 ; i<size ; i++){
        TreeNode  node = q.poll();

        if(node.left!= null && vis.get(node.left)== null){
            q.offer(node.left);
            vis.put(node.left , true);
        }

        if(node.right!= null && vis.get(node.right)== null){
            q.offer(node.right);
            vis.put(node.right , true);
        }
       if( parent_track.get(node) != null && vis.get( parent_track.get(node)) == null  ){
        q.offer( parent_track.get(node));
        vis.put( parent_track.get(node) , true);
       }

      }


       }
List <Integer> ans = new ArrayList<>();
while(!q.isEmpty()){
    TreeNode  node = q.poll();
    ans.add(node.val);
}
return ans;
    }
}

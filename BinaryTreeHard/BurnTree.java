package BinaryTreeHard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.w3c.dom.Node;

public class BurnTree {
      public static int helper(Map<Node , Node> map , Node target){
        Map<Node , Boolean> vis = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(target);
        vis.put(target , true);
        int maxi = 0 ;
        
        while(!q.isEmpty()){
            int fl =0 ;
            int size = q.size();
           
           for(int i = 0 ; i<size ; i++){
                 Node node = q.poll();
                 if(node.left != null && vis.get(node.left)==null){
                    fl =1;
                    q.offer(node.left);
                    vis.put(node.left , true);
                 }
                   if(node.right != null && vis.get(node.right)==null){
                    fl =1;
                    q.offer(node.right);
                    vis.put(node.right , true);
                 }
                 if(map.get(node) != null && vis.get(map.get(node))==null ){
                     fl = 1;
                     q.offer(map.get(node));
                     vis.put(map.get(node), true);
                 }
                 
                 
           }
             
            if(fl ==1) maxi++;
            
            
        }
        
        return maxi;
    }
    
    public static Node Bfs(Node root ,Map<Node , Node> parent_track , int target ){
        Queue<Node> q = new LinkedList<>();
        Node  res = new Node(-1);
        q.offer(root);
        
        
        while(!q.isEmpty()){
           Node curr = q.poll();
           if(curr.data == target) res = curr;
           
           if(curr.left != null){
             parent_track.put(curr.left , curr);
             q.offer(curr.left);
           }
            if(curr.right != null){
             parent_track.put(curr.right , curr);
             q.offer(curr.right);
           }
            
        }
        
       return res; 
        
    }

    public static int minTime(Node root, int target) {
        Map<Node , Node> parent_track = new HashMap<>();
        Node start = Bfs(root , parent_track , target);
        int maxi = helper(parent_track , start);
        return maxi;
        
    }
}

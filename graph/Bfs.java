package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
          ArrayList < Integer > bfs = new ArrayList < > ();
        Queue<Integer> q = new LinkedList<>();
         boolean vis [] = new boolean[V];
         
         q.add(0);
         
         while(!q.isEmpty()){
             int curr = q.remove();
             if(!vis[curr]){
                 bfs.add(curr);
                    vis[curr] = true;
                    
                    
                       for (int i = 0; i < adj.get(curr).size(); i++) {
                    
                        int e = adj.get(curr).get(i);
                        q.add(e);

                    }
                 
                 
                 
             }
             
             
             
             
             
         }
        
        
        
        
    return bfs;    
        
    }
}

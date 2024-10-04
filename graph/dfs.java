package graph;

import java.util.ArrayList;

public class dfs {
       
    public void dfs(int curr , boolean [] vis , ArrayList<ArrayList<Integer>> adj ,ArrayList<Integer> ls){
         
         ls.add(curr);
         vis[curr]= true;
         
         for(int i = 0 ; i<adj.get(curr).size() ; i++){
             int e = adj.get(curr).get(i);
             if(!vis[e]){
                         dfs(e, vis, adj, ls); 
             }
         }
         
         
     }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        
        
         boolean vis[] = new boolean[V];
        vis[0] = true; 
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls); 
        return ls; 
    }
}

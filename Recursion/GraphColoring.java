import java.util.List;

public class GraphColoring {

       private static boolean isSafe(int node, List<int[]> edges, int[] color, int n, int col) {
    //    for(int i = 0 ; i<edges.get(node).length ; i++){
    //       int u = edges.get(node)[i]; 
    //        if(color[u] == col) return false;
    //    }
    //     return true;
    for (int i = 0; i < edges.size(); i++) {
        int[] edge = edges.get(i); // Get the edge
        int u = edge[0], v = edge[1]; // Extract endpoints

        // Check if the current node is part of the edge and the connected node has the same color
        if ((u == node && color[v] == col) || (v == node && color[u] == col)) {
            return false;
        }
    }
    return true;
}

    
    
    
    
    
    
    public static boolean helper(int node , List<int[]> edges , int [] color , int m ,
    int v){
        if(node == v) return true;
        
        
        for(int i = 1 ; i<=m ; i++){
            if(isSafe(node ,edges, color ,v , i )){
                color[node] = i;
                if (helper(node + 1, edges, color, m,v) == true) return true;
                color[node] = 0; 
            }
        }
        
        return false;
    }
    
    
    
    boolean graphColoring(int v, List<int[]> edges, int m) {
     int color [] = new int[v];
     
      if(helper(0 , edges ,color , m ,v) == true) return true;
      return false;
    }
}
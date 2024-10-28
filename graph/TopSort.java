
public class TopSort
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        boolean vis [] = new boolean [V];
        
            Stack<Integer> s =new Stack<>();
            
            for(int i=0 ; i<V ; i++){
                if(!vis[i]){
                    
                int curr = i;
                vis[curr] = true;
                
                for(int j =0 ; j<adj.get(curr).size() ; j++){
                   int e =  adj.get(curr).get(j);
                   if(!vis[e]){
                       topoSort(V , adj);
                   }
                }
                    
                     s.push(curr);
                    
                    
                    
                }
            }
           
           int [] res = new int[V];
           int k =0;
           while (!s.isEmpty()) {
             res[k] =  s.pop();
             k++;
            } 
            
            
            
            
          return res;  
            
            
        
    }
}


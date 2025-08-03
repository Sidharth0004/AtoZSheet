package graph;

public class NoOfProvinces {
    
   public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean vis [] = new boolean[n+1];
        int ans = 0;
        for(int i = 0 ; i< n ; i++){
             if(!vis[i]){
                 helper(isConnected , vis , i);
                 ans++;
             }
        }
        return ans;

    }

    public void helper(int [][] isConnected , boolean [] vis, int curr){
        vis[curr]= true;

        for(int i =0 ; i<isConnected.length ; i++){
            if(isConnected[curr][i] ==1 && curr != i){
                if(!vis[i]){
                    helper(isConnected , vis , i);
                }
            }
        }
    }


}

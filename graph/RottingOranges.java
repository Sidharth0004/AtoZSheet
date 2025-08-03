package graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    
      class Pair {
        int row ;
        int col;
        int tm;

    Pair(int row , int col , int tm){
        this.row = row ;
        this.col = col;
        this.tm = tm;
    }

    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int vis[][] = new int[n][m];
        int cnt = 0;

        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j<m ; j++){
               if(grid[i][j]==2){
                 q.add(new Pair(i,j,0));
                 vis[i][j] =2;
               }
               else{
                vis[i][j] = 0;
               }
               if(grid[i][j]==1) cnt++;
            }
        }

        int tm =0 ;
    int dr[]  = {-1,0,1,0};
    int dc[] ={0,1,0,-1};
    while(!q.isEmpty()){    
        int r = q.peek().row;
        int c = q.peek().col;
        int t = q.peek().tm;

        tm =Math.max(tm,t);
        q.remove();
      
      for(int i =0 ; i<4 ; i++){
        int nrow = r + dr[i];
        int ncol = c + dc[i];
        if(nrow >= 0 && nrow < n && ncol >= 0 && ncol <m
    && vis[nrow][ncol] != 2 &&  grid[nrow][ncol] ==1){
        q.add(new Pair(nrow , ncol , t+1));
        vis[nrow][ncol] = 2;

    }

      }
      
         
    }
    
for(int i = 0 ; i<n ;i++){
    for(int j = 0 ; j<m ; j++){
        if(vis[i][j] !=2 && grid[i][j]==1){
            return -1;
        }
    }
}


return tm;

    }

}

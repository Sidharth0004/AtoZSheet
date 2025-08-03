package graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
        
      class Pair{
        int row;
        int col;

        public Pair(int row , int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;

    Queue<Pair> q= new LinkedList<>();
    q.add(new Pair(sr,sc));
    int vis[][] = new int[n][m];
       int ans[][] = new int[n][m];


    for(int i = 0 ; i<n ;i++){
    for(int j = 0 ; j<m ; j++){
       vis[i][j] = 0;
       ans[i][j] = image[i][j];
        }
    }
        vis[sr][sc] = color;
        ans[sr][sc] =color;


  int dr[]  = {-1,0,1,0};
    int dc[] ={0,1,0,-1};

  while(!q.isEmpty()){
       int r = q.peek().row;
        int c = q.peek().col;

             q.remove();

    for(int i =0 ; i<4 ; i++){
        int nrow = r + dr[i];
        int ncol = c + dc[i];

        if(nrow>=0 && nrow <n && ncol >= 0 && ncol <m
        && vis[nrow][ncol] != color && image[nrow][ncol] == image[sr][sc]){
        q.add(new Pair(nrow , ncol));
        vis[nrow][ncol] = color;
     ans[nrow][ncol] =color;
        }

  }


  }

 return ans;





    }



}

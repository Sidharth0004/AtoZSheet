

import java.util.Arrays;

public class UniquePath2 {
    

    public static int helper(int[][] obstacleGrid , int m , int n , int [][] dp ){
  
        if(m<0 || n<0){
            return 0;
        }
    
        if(obstacleGrid[m][n]==1){
            return 0;
        }
          if(m==0 && n==0){
            return 1;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
    
        int up = helper(obstacleGrid , m-1 , n , dp);
        int left = helper(obstacleGrid , m , n-1,dp);
    
          return dp[m][n] = up+left;
    
    
    }
    
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
    
            int dp [][] = new int [m][n];
            for(int [] row : dp)
             Arrays.fill(row, -1);
    
        return     helper(obstacleGrid , m-1 , n-1 , dp);
            
        }

        

}


import java.util.Arrays;

public class MinPathSum {
    
    public static int helper(int [][]  grid , int m , int n , int [][] dp){

if(n==0 && m==0){
    return  grid[0][0];
}
if(n<0 || m<0){
    // return Integer.MAX_VALUE;
     return (int) Math.pow(10, 9);
}
  if (dp[m][n] != -1)
            return dp[m][n];

            

    int up =  grid[m][n]+ helper( grid  , m-1 ,n, dp);
    int left =  grid[m][n]+helper( grid , m ,n-1 , dp) ;

     return dp[m][n] = Math.min(up, left);


    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n =  grid[0].length;
        int dp [][] = new int[m][n];

        for(int [] row : dp){
            Arrays.fill(row,-1);
        }

        return helper( grid ,m-1 , n-1 , dp);
        
    }
}

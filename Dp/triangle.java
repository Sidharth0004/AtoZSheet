
import java.util.Arrays;
import java.util.List;

public class triangle {
   
       public static int helper(int i ,int j ,List<List<Integer>> triangle , int m , int [][] dp ){

          if (dp[i][j] != -1)
            return dp[i][j];

            if(i==m){
                return triangle.get(i).get(j);
            }

            int down = triangle.get(i).get(j) + helper(i+1 , j , triangle , m , dp);
            int diagonal = triangle.get(i).get(j) + helper(i+1 , j+1 , triangle , m , dp);

            return dp[i][j] = Math.min(down , diagonal);
     }


    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m-1).size();
       int dp [][] = new int [m][n];
            for(int[] row : dp){
             Arrays.fill(row, -1);
        }
        int maxi = Integer.MIN_VALUE;

        return helper(0,0,triangle , m-1 ,dp);

    }


}

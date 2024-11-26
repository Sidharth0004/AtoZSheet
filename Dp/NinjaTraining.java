

import java.util.Arrays;

public class NinjaTraining {
    public static int helper(int day , int last , int arr [][] , int dp[][]){
        if(dp[day][last] != -1){
            return dp[day][last];
        }
        
        if(day == 0){
            int maxi=0;
             for (int i = 0; i <= 2; i++) {
                if (i != last)
                    maxi = Math.max(maxi, arr[0][i]);
            }
            return dp[day][last] = maxi; 
        }
        
        
        
        int max = 0;
      for(int i =0 ; i<=2 ; i++){

      if(i !=last){
          
             int curr = arr[day][i] + helper(day-1 , i , arr , dp);

          max = Math.max(max, curr);
  
      }
     
      }  
        
         return dp[day][last] = max;
    }
    
    
    
    public int maximumPoints(int arr[][], int n) {
        // code here
        int dp [][] = new int [n][4];
        
                for (int[] row : dp)
            Arrays.fill(row, -1);


       return helper(n-1 , 3 , arr , dp);
        
        
        
    }
}

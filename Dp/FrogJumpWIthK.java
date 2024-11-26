

import java.util.Arrays;

public class FrogJumpWIthK {
     
    public static int helper(int [] arr , int k , int n  , int [] dp){
        if(n==0){
            return 0 ;
            
        }
        
           if (dp[n] != -1)
            return dp[n];
        
        
        int minStep = Integer.MAX_VALUE;
        
           for (int j = 1; j <= k; j++) {

            if (n - j >= 0) {

                int jump = helper(arr , k , n-j , dp) + Math.abs(arr[n] - arr[n - j]);
                minStep = Math.min(jump, minStep);
            }
        }
        
        
          return dp[n] = minStep;
        
    }
    
    
    public int minimizeCost(int k, int arr[]) {
        // code here
        
    int n = arr.length;    
  int dp [] = new int [n];
   Arrays.fill(dp, -1);
  
    int ans =    helper(arr, k ,n-1, dp);
  return ans;
  
  
    }
}

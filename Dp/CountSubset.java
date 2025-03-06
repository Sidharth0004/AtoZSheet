

import java.util.Arrays;

public class CountSubset {
    

   

class Solution {
    // Function to calculate the number of subsets with a given sum
    public static int helper(int ind , int target , int [] num , int [][] dp){
        // if(target ==0){
        //     return 1;
        // }
        
           if(ind == 0){
        if(target==0 && num[0]==0)
            return 2;
        if(target==0 || target == num[0])
            return 1;
        return 0;
    }
        if (dp[ind][target] != -1)
            return dp[ind][target];

   int notTaken = helper(ind-1 , target , num , dp);
    int taken = 0;
   if(num[ind]<= target){
      taken=  helper(ind-1 , target-num[ind] , num , dp);
      
   }
   
  return dp[ind][target] = notTaken + taken;
        
    }
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int [][] dp = new int [n][target+1];
        for(int [] row : dp){
            Arrays.fill(row,-1);
            
        }
        
     return helper(n-1 , target , nums ,dp);   
        
    }
}
}

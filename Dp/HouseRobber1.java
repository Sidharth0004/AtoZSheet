


// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.

import java.util.Arrays;

public class HouseRobber1 {
        public static int helper(int [] nums , int n, int [] dp ){
 
      if(n==0){
        return nums[n];
      }
      if(n<0){
        return 0 ;
      }

      if(dp[n]!=-1){
        return dp[n]; 
      }

      int pick =helper(nums , n-2 , dp)+nums[n]  ;
      int nonPick =helper(nums , n-1 , dp) ;


     return dp[n] = Math.max(pick, nonPick);



    }
    public int rob(int[] nums) {
        int n= nums.length;
        int dp [] = new int[n];
           Arrays.fill(dp, -1);
        int ans = helper(nums , n-1 ,dp);
        return ans;
    }
}

 //! Tabulation
 public static int helper(int [] nums , int n, int [] dp ){
 
  dp[0] = nums[0];

  for(int i = 1 ; i< n ; i++){
        int pick = nums[i];
        if(i>1){
      pick  += dp[i-2] ;
        }
     int nonPick = dp[i-1];

     dp[i] = Math.max(pick, nonPick);
  }
return dp[n-1];

 }
 public int rob(int[] nums) {
     int n= nums.length;
     int dp [] = new int[n];
        Arrays.fill(dp, -1);
     int ans = helper(nums , n ,dp);
     return ans;
 }
package DpLis;

import java.util.Arrays;

public class Lis1 {
    public static int helper(int ind ,int prevInd , int [] nums , int [][] dp){
int n = nums.length;
 if ( ind == n) return 0;


    if(dp[ind][prevInd+1]!= -1){
        return dp[ind][prevInd+1];
    }

  int notTake = helper(ind+1 , prevInd , nums , dp);
  int take = 0;
if(prevInd ==-1 || nums[ind] >nums[prevInd]){
    take = 1+ helper(ind+1 , ind , nums , dp);
}

return dp[ind][prevInd+1] = Math.max(take , notTake);
}



    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp [][] = new int [n][n+1];
        for(int [] row : dp){
            Arrays.fill(row , -1);
        }

        return helper(0 , -1 , nums , dp);

    }
}

// ! Tabulation
// public int lengthOfLIS(int[] nums) {
//     int n= nums.length;
//    int  dp[][]=new int[n+1][n+1];

//   for(int ind = n-1 ; ind>=0 ; ind --){
//     for(int prevInd = ind-1 ; prevInd>=-1 ; prevInd--){
//          int notTake = dp[ind+1][ prevInd+1 ];
// int take = 0;
// if(prevInd ==-1 || nums[ind] >nums[prevInd]){
// take = 1+ dp[ind+1] [ind+1] ;
// }
// dp[ind][prevInd+1] = Math.max(notTake,take);
//     }
//   }
// return dp[0][0];

// }

// !  Best Method in case of space complexity (required to trace back LIS)
// public int lengthOfLIS(int[] nums) {
//     int n = nums.length;
//     int dp [] = new int [n];
//     Arrays.fill(dp ,1);
// int maxi = 1;
// for(int ind = 0 ; ind<n; ind++){
// for(int prev = 0 ; prev<ind ; prev++){
//   if(nums[prev] < nums[ind]){
//     dp[ind]= Math.max(1+dp[prev] , dp[ind]);
//   }
// }
// maxi = Math.max(maxi , dp[ind]);
// }

// return maxi;
// }

// // Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.

 

// // Example 1:

// // Input: nums = [1,5,11,5]
// // Output: true
// // Explanation: The array can be partitioned as [1, 5, 5] and [11].

// import java.util.Arrays;

// public class PartitionEqual {
//       public static boolean helper(int ind , int target , int [] nums , int dp[][]){
//         if(target ==0){
//             return true;
//         }
//         if(ind==0){
//             return target == nums[0];
//         }
        
//         if(dp[ind][target]!= -1){
//        return dp[ind][target] == 0 ? false : true;
//         }
//     boolean notTaken = helper(ind -1 , target , nums , dp);
//     boolean taken = false;
//     if(nums[ind]<= target) {
//         taken = helper(ind-1 , target-nums[ind], nums , dp);
//     }

//     dp[ind][target] = notTaken || taken ? 1 : 0;
//     return notTaken || taken;


//    }



//     public boolean canPartition(int[] nums) {
//         int n = nums.length;
//         int totalSum = 0;
//         for(int i = 0 ; i<nums.length ; i++){
//             totalSum += nums[i];
//         }

//      if(totalSum%2 == 1)
//         return false;
     
//      else{
//         int k = totalSum/2;
//         int dp [][] = new int[n][k+1];
//         for(int row [] : dp)
//             Arrays.fill(row,-1);
        
//     return helper(n-1  , k ,nums , dp);
//  }
//     }
// }

public class PartitionEqual {

    public boolean canPartition(int[] arr) {

        int n = arr.length;
        
             int totSum = 0;
             for (int i = 0; i < n; i++) {
                 totSum += arr[i];
             }
     
       
             if (totSum % 2 == 1) 
                 return false;
             else {
           
                 int k = totSum / 2;
     
                 boolean dp[][] = new boolean[n][k + 1];
     
                 
                 for (int i = 0; i < n; i++) {
                     dp[i][0] = true;
                 }
     
                 if (arr[0] <= k) {
                     dp[0][arr[0]] = true;
                 }
     
                 
                 for (int ind = 1; ind < n; ind++) {
                     for (int target = 1; target <= k; target++) {
                         
                         boolean notTaken = dp[ind - 1][target];
     
                         // Calculate if the current element is taken
                         boolean taken = false;
                         if (arr[ind] <= target) {
                             taken = dp[ind - 1][target - arr[ind]];
                         }
     
        
                         dp[ind][target] = notTaken || taken;
                     }
                 }
     
                 
                 return dp[n - 1][k];
             
     
     
     
     
     
     
     
     
     
             }
            }
}
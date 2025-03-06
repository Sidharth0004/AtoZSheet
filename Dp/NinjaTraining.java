

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

// ! Tabulation
// static int ninjaTraining(int n, int[][] points) {
//     // Initialize a 2D array 'dp' to store the maximum points
//     int[][] dp = new int[n][4];
    
//     // Initialize the first day's maximum points based on the available choices
//     dp[0][0] = Math.max(points[0][1], points[0][2]);
//     dp[0][1] = Math.max(points[0][0], points[0][2]);
//     dp[0][2] = Math.max(points[0][0], points[0][1]);
//     dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

//     // Iterate through each day and each activity
//     for (int day = 1; day < n; day++) {
//         for (int last = 0; last < 4; last++) {
//             dp[day][last] = 0; // Initialize the maximum points for the current day and last activity
//             // Consider each possible task for the current day
//             for (int task = 0; task <= 2; task++) {
//                 if (task != last) { // Ensure that the current task is different from the last
//                     // Calculate the points for the current activity and add it to the maximum points from the previous day
//                     int activity = points[day][task] + dp[day - 1][task];
//                     // Update the maximum points for the current day and last activity
//                     dp[day][last] = Math.max(dp[day][last], activity);
//                 }
//             }
//         }
//     }

//     // Return the maximum points achievable after all days (last activity is 3)
//     return dp[n - 1][3];
// }
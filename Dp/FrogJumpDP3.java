

public class FrogJumpDP3 {
    static int helper(int arr [] , int n , int [] dp){
       
        if(n==0){
      return 0;
  }
  
 
  
    if(dp[n] != 0){
return dp[n];
}



int jumpTwo = Integer.MAX_VALUE;
int jumpOne= helper( arr,n-1 , dp) + Math.abs(arr[n]-arr[n-1]);
if(n>1){
   jumpTwo= helper( arr,n-2,dp)+ Math.abs(arr[n]-arr[n-2]);
}


return dp[n]=Math.min(jumpOne, jumpTwo);

  
}
public int minimumEnergy(int arr[],int N){
  //code here

  int dp [] = new int [N+1];
    int ans =    helper(arr, N-1 , dp);
  return ans;
  
  
  
} 
}

//! Tabulation
// int minCost(int[] height) {
//   // code here
//   int n = height.length;
//   int  dp [] = new int [height.length];
//   dp[0] = 0 ;
  
//   for(int i = 1 ; i<height.length ; i++){
//       int fs = dp[i-1]+ Math.abs(height[i] - height[i-1]);
//       int ss = Integer.MAX_VALUE;
//       if(i>1){
//           ss = dp[i-2] + Math.abs(height[i] - height[i-2]);
//       }
//       dp[i] = Math.min(fs,ss);
//   }
//   return dp[n-1];
  
// }


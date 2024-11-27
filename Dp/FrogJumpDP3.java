

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


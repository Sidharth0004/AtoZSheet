public class CountGoodNum {
    static int mod =(int)(Math.pow(10,9)+7);

    public static int helper(int ind , long n , int N){
  
    if(ind == N){
      if(n==0){
          return 1;
      }
      return 0 ; 
    }
    int notTake =  helper(ind+1 ,n , N);
    int take = 0 ;
      if(n!=0){
          take  =  helper(ind+1 , n-1 , N);
      }
  
     return  (notTake + take)%mod;
  
    }
  
      public int countGoodNumbers(long n) {
          int N = 5;
        return  helper(0, n ,N );
      }
}

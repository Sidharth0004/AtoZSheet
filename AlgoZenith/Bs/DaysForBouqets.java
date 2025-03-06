public class DaysForBouqets {
    public int checks(int [] bloomDay ,int  m ,int  k , int mid) {
        int noOfB = 0;
        int cnt = 0 ;
        int n = bloomDay.length;

        for(int i = 0 ; i < n ; i++ ){
            if(bloomDay[i]<=  mid){
                cnt++;
            }else{
                 noOfB += (cnt / k);
                cnt = 0;
            }
        } 
        noOfB += (cnt / k);
      if( noOfB >= m){
        return 1;
      }
  return 0;


    }





    public int minDays(int[] bloomDay, int m, int k) {
       int mini = 0 ;
       int max = 0 ;
       int n = bloomDay.length;

       for(int i =0 ;i< n ; i++ ){
          mini = Math.min(mini , bloomDay[i]);
          max = Math.max(max , bloomDay[i]);

       }
      int lo = mini;
      int hi = max;
      int ans = -1;

      while(lo<=hi){
        int  mid = lo +(hi-lo)/2;
        if(checks(bloomDay , m , k , mid) == 1){
            ans =mid;
            hi = mid-1;
        }else{
            lo =mid+1;
        }
      }

   return ans;
    }
}

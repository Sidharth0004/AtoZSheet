public class koko {
    public int checks(int piles [] , int mid , int h){
        int tothrs = 0;
         for(int i = 0 ; i<piles.length ; i++){
              tothrs += Math.ceil((double)(piles[i]) / (double)(mid));
         }
    
    if( tothrs >h ){
           return 0;
    }
     
    
        else{
            return 1;
        }
    
    }
    
    public int minEatingSpeed(int[] piles, int h) {
      int max = 0;
      int n = piles.length;
      for (int i = 0; i < n; i++) {
        max = Math.max(max, piles[i] );
      }
      int low = 0;
      int high = max;
      int ans = 0;
    
      while (low <= high) {
        int mid = low + (high-low) / 2;
        //   System.out.print(mid);
        if (checks(piles , mid,h) == 1) {
          ans = mid;
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      }
    
      return ans;
    }
}

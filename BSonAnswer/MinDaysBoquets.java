package BSonAnswer;

public class MinDaysBoquets {

    private Boolean possible(int [] arr , int day , int m , int  k){
        int n = arr.length; // Size of the array
               int cnt = 0;
               int noOfB = 0;
               // Count the number of bouquets:
               for (int i = 0; i < n; i++) {
                   if (arr[i] <= day) {
                       cnt++;
                   } else {
                       noOfB += (cnt / k);
                       cnt = 0;
                   }
               }
               noOfB += (cnt / k);
               return noOfB >= m;
       
       
          }
       
       
           public int minDays(int[] bloomDay, int m, int k) {
               int mini =0;
               int maxi =0;
               for(int i = 0 ; i<bloomDay.length ; i++){
                   mini = Math.min(mini, bloomDay[i]);
                   maxi = Math.max(maxi, bloomDay[i]);
       
               } 
                 int ans=0;
                 int low = mini, high = maxi;
       
               int n = bloomDay.length;
               long val = (long) m * k;
               if (val > n) return -1;
                 
                   while(low<=high){
                       int mid = (low+high)/2;
                      Boolean poss = possible(bloomDay, mid, m, k);
                       if(poss){
                           ans = mid;
                           high = mid-1;
                       }
                       else{
                           low = mid+1;
                       }
                    
                   }
       
          return ans;
        //   return low;
       
           }
}
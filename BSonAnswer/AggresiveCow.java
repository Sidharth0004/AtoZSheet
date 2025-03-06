package BSonAnswer;

import java.util.Arrays;

public class AggresiveCow {
        public static Boolean  canWePlace(int [] stalls , int dis , int k){
        int n = stalls.length;
        int cntcows = 1 ;
        int last = stalls[0];
        
        for(int i =1 ; i<n ; i++){
            if(stalls[i] -last>=dis){
                cntcows++;
                last = stalls[i];
            }
        }
        if(cntcows>=k){
            return true;
            
        }
        return false;
        
    }
    
    public static int aggressiveCows(int[] stalls, int k) {
        int n = stalls.length;
    Arrays.sort(stalls);
        int low = 1; 
         int high = stalls[n - 1] - stalls[0];
        int ans = 0 ;
         while(low<= high){
             int mid = (low + high)/2;
            Boolean minDis = canWePlace(stalls , mid , k); 
            if(minDis==true){
                ans = mid;
           low = mid+1;
                
            }
            else{

                 high = mid -1;
            }
           
         }
        
        
        return ans; 
    }
}

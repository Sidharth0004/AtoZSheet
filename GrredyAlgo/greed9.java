package GrredyAlgo;

import java.util.Arrays;
	
//! Minimum number of platforms required for a railway

public class greed9 {
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
          Arrays.sort(dep);
          int n = arr.length;
          int i = 0 ;
           int j =0 ;
           int cnt = 0 ; int maxcnt = 0 ; 
           while(i<n ){
               if(arr[i]<=dep[j]){
                 cnt++;
                 i++;
               }
               else{
                   cnt--;
                   j++;
               }
               
               maxcnt = Math.max(cnt , maxcnt);
           }
           return maxcnt;
           
    }
    
}


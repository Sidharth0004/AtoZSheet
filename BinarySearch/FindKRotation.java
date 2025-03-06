package BinarySearch;

import java.util.List;

public class FindKRotation {
     public int findKRotation(List<Integer> arr) {
     
     int n = arr.size();
     int low =0 ;
     int high = n-1;
     
     int ans = Integer.MAX_VALUE;
     int ind = -1;
     
     while(low<= high){
         int mid = (low+high)/2;
         
         if(arr.get(low)<=arr.get(mid)){
             
             if(arr.get(low)<ans){
                 ind = low ;
                 ans = arr.get(low);
             }
             low =mid+1;
             
         }
         else{
              if(arr.get(mid)< ans){
                 ind = mid ;
                 ans = arr.get(low);
             }
             high =mid-1; 
         }
         
         
         
     }
        
        
        return  ind;
        
        
        
    }
}

package BinarySearch;

import java.util.Arrays;

public class CeilTheFloor {
        
    
    static int findFloor(int[] arr, int x) {
        
        int n = arr.length;
          int low = 0, high = n-1;
        
        int ans = -1 ;
        
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                high = mid-1;
            }
            else{
                low = mid+1;
             ans = mid;
            }
            
        }
        
        return ans;
    }
    static int findCeil(int[] arr, int x) {
        
        int n = arr.length;
          int low = 0, high = n-1;
        
        int ans = -1 ;
        
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){

                high = mid -1;
                ans =   mid;
            }
            else{
                low = mid+1;
            }
            
        }
        
        return ans;
    }
    
    public int[] getFloorAndCeil(int x, int[] arr) {
     Arrays.sort(arr);
     int flor = findFloor(arr ,x);
     int ceil = findCeil(arr , x);
     
     int ans1 = flor == -1? -1 : arr[flor]; 
     int ans2 = ceil == -1? -1 : arr[ceil]; 
     
     
     return new int []{ans1 , ans2};
     
     
    }
}

public class PainterPartition {
    public int checks(int arr [] , int k , int mid){
        int last_painter_time = 0;
        int num_painter_spawned = 0;
        
        for(int i = 0 ; i<arr.length ; i++){
           if(last_painter_time >= arr[i]){
               last_painter_time -=arr[i];
           } 
           else{
               num_painter_spawned++;
               if(num_painter_spawned>k){
                   return 0 ;
               }
               last_painter_time = mid;
               if(last_painter_time >= arr[i]){
               last_painter_time -=arr[i];
           } else{
               return 0 ;
           }
               
           }
        }
        
      return 1;   
    }
    
    
    
    public int minTime(int[] arr, int k) {
        int  sum = 0 ;
        int  ans = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            sum += arr[i];
        }
        // System.out.println(sum);
         int lo = 0 ;
         int hi = sum;
         while(lo<= hi){
             int mid = lo + (hi-lo)/2;
             if(checks(arr ,k ,mid) ==1){
                 ans = mid;
                hi = mid-1;   
             }
             else{
                 lo = mid +1;
             }
         }
        return ans; 
         
    }
}

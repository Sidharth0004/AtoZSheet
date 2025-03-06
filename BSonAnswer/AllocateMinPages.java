package BSonAnswer;

public class AllocateMinPages {
    public static int cntStd(int [] arr , int pages){
        int n = arr.length;
        int std = 1;
        int pageStd =0;
        for(int i = 0 ; i<n ; i++){
            if(pageStd+arr[i] <= pages){
                pageStd += arr[i];
                
            }
            else{
               std++;
               pageStd = arr[i];
            }
            
        }
        return std;
    }
   
       public static int findPages(int[] arr, int k) {
           // code here
           int n = arr.length;
           if(k>n) return -1;
                   
           int maxi = 0 ;
           int sum = 0 ;
           for(int i = 0 ; i<n ; i++){
               maxi = Math.max(maxi , arr[i]);
               sum += arr[i];
           }
           int low = maxi;
           int high = sum;
           int ans = 0 ;
           
           while(low<=high){
               int mid = (low+high)/2;
               int std = cntStd(arr ,mid);
               if(std>k){
                   low = mid+1;
               }else{
                   ans = mid;
                   high =mid-1;
                   
               }
           }
           
        return ans;   
}
}
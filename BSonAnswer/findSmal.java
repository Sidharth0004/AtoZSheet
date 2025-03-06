package BSonAnswer;

public class findSmal {
    private int divisor(int arr[] , int div ){
        int n = arr.length;
        int res =0;
        for(int i = 0; i<n ; i++){
            res += Math.ceil((double)(arr[i]) / (double)(div));
    
        }
        return res;
    }
    
        public int smallestDivisor(int[] nums, int threshold) {
    
           int maxi=0;
           int n = nums.length;
             if(n > threshold) return -1;
    
           for(int i = 0 ; i<n ; i++){
              maxi = Math.max(maxi , nums[i]);
    
           }
           int low = 1 ; 
           int high = maxi;
           int ans = 0 ;
    
           while(low<=high){
            int mid =(low+high)/2;
            int div = divisor(nums , mid);
            if(div<=threshold){
                ans = mid;
                high = mid-1;
            }
            else{
            low=mid+1;
     
            }
    
           }
    
    return ans;
        }
}

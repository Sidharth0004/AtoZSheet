package BSonAnswer;

public class SplitArr {
    
  private int noOfarr(int [] arr , int load){
    int n = arr.length;
    int arrs = 1;
    int sum =0;
    for(int i = 0 ; i<n ; i++){
        if(sum + arr[i] <=load){
            sum += arr[i];
        }
        else{
            arrs++;
            sum = arr[i];
        }

    }
 return arrs;

  }




    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int maxi = 0 ; 
        int sum =0;
        int ans = 0;
      for(int i =0; i<n ; i++){
        maxi = Math.max(maxi , nums[i]);
        sum += nums[i];
      }
      if(k>n) return -1;
      int low = maxi;
       int high = sum;

       while(low<= high){
        int mid = (low+high)/2;
        int splitarr = noOfarr(nums , mid);

       if(splitarr> k){
        low = mid+1;
       }
       else{
        high = mid-1;
        ans = mid;
       }

       }
  return ans;
    }
}

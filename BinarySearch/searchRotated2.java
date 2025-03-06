package BinarySearch;

public class searchRotated2 {
    public boolean search(int[] nums, int target) {
      
    
        int n =  nums.length;
        int low = 0 ;
         int high = n-1;
       
         while(low<=high){
       
       
           int mid = (low+high)/2;
          if(nums[mid] == target){
           return true;
          }

          //! this step
          if(nums[mid] == nums[low] && nums[mid] == nums[high]){
           low++;
           high--;
           continue;
          }
          // left sort
          if(nums[low]<= nums[mid]){
           if(nums[low]<=target && nums[mid]>= target){
               high = mid-1;
           }else{
               low= mid+1;
           }
          }
          else{
        if(nums[mid]<= target && target<= nums[high]){
           low = mid+1;
        }else{
           high = mid-1;
        }
          }
       
       
         }
       return false;
       
       
           }  
}

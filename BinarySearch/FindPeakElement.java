package BinarySearch;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        int li = 0;
        int ri = nums.length-1;
  
        while(li<ri){
          int mid = (li + ri)/2;
       
         if(nums[mid]>nums[mid+1]){
          ri = mid;
         }
         else{
          li = mid+1;
         }
    
  
        }
  
  return li;
  
      }



}

package BinarySearch;
// nums = [1,3,5,6], target = 5
// nums = [1,3,5,6], target = 2

public class SearchInsertPos {
    
    class Solution {
        public int searchInsert(int[] nums, int target) {
    
           int li = 0;
           int ri = nums.length-1;
    
           while(li<ri){
            int mid = (li+ri)/2;
            if(nums[mid]==target){
               return mid;
            }
            
            if(nums[mid]>target){
                ri= mid-1;
              
            }
           else{
              li= mid+1;
           }
    
    
           }
           if(target>nums[nums.length-1]){
                return nums.length;
               }
    
            // for(int i = 0; i<nums.length;i++){
            //     if(nums[i] < target && i+1<nums.length ){
            //         return i+1;
            //     }
            int i=0;
            while(nums[i] < target && i+1<nums.length){
              i++;
            }
               
             return i;    
    
    
        
        }
       
    }
}

package BinarySearch;
// Single Element in a Sorted Array
// 1,1,2,3,3,4,4,8,8

public class SingleElement {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
           int li = 0;
            int n = nums.length;
           int ri = n-1 ;
        
           while(li<ri){
            int mid = (li+ri)/2;
            if(( mid%2 == 0 && mid+1<n && nums[mid]==nums[mid+1])||
             ( mid %2 ==1 && mid-1 >=0 && nums[mid] == nums[mid-1]))
         li = mid+1;
         
         else{
            ri= mid;
         }
         if( mid-1 >0&& mid+1<n && nums[mid]!=nums[mid+1] &&  nums[mid] != nums[mid-1]){
            return nums[mid];
         }
           } 
    
    return nums[li];
    
        }
    }
}

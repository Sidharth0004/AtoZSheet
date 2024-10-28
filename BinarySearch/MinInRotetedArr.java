package BinarySearch;
// 153. Find Minimum in Rotated Sorted Array
// 3,4,5,1,2]

public class MinInRotetedArr {
    

    class Solution {
        public int findMin(int[] nums) {
            int l=0;
             int r=nums.length-1;
             while(l<r){
                  int mid = (r+l)/2;
                 if(nums[mid]>nums[r]){
                      l= mid+1;
                     
                 }
                  else{
                      r= mid;
                  }
             }
             return nums[r];
        } }
}

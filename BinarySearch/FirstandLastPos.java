package BinarySearch;
// 34. Find First and Last Position of Element in Sorted
// [5,7,7,8,8,10]
public class FirstandLastPos {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int n = nums.length;
            int si = 0;
            int ei = n-1;
    
            while(si<=ei){
                int mid = (ei+si)/2;
    
            if(nums[mid] ==target){
                 int start = mid, end = mid;
            
            while (start > 0 && nums[start - 1] == target) start--;
            while (end < nums.length - 1 && nums[end + 1] == target) end++;
            
            return new int[]{start, end};
                
                }
    
         
           else if(nums[mid]<target){
          si = mid+1;
    
        }
          else
            ei = mid-1;
            }
    
     return new int []{-1,-1};
    
            }
    
    
    
    
    
    
    
    
        }
}

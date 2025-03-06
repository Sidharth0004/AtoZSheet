package BinarySearch;
// 34. Find First and Last Position of Element in Sorted
// [5,7,7,8,8,10]
public class FirstandLastPos {
    class Solution {
        static int upperBound(int[] arr, int x) {
        
            int n = arr.length;
              int low = 0, high = n-1;
            
            int ans = n ;
            
            while(low <= high){
                int mid = (low+high)/2;
                if(arr[mid]>x){
                    high = mid-1;
                    ans = mid;
                }
                else{
                    low = mid+1;
                 
                }
                
            }
            
            return ans;
        }
         static int lowerBound(int[] arr, int x) {
            
            int n = arr.length;
              int low = 0, high = n-1;
            
            int ans = n ;
            
            while(low <= high){
                int mid = (low+high)/2;
                if(arr[mid]>=x){
    
                    high = mid -1;
                    ans =   mid;
                }
                else{
                    low = mid+1;
                }
                
            }
            
            return ans;
        }
    
    
    
        public int[] searchRange(int[] nums, int target) {
            int n = nums.length;
            int lb = lowerBound(nums , target);
             int up = upperBound(nums , target);
            if(lb == n || nums[lb] != target) return new int [] {-1,-1};
    
            return new int [] {lb , up-1};
        }
}}

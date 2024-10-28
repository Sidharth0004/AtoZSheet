package BinarySearch; 
// 81 Search in Rotated Sorted Array II

// [2,5,6,0,0,1,2], 

public class BinarySearch2 {
    class Solution {
        public boolean search(int[] nums, int target) {
             int left = 0;
            int right = nums.length - 1;
    
            while (left <= right) {
                int mid = (left + right) / 2;
    
                if (nums[mid] == target) {
                    return true;
                } 
                  if (nums[left] == nums[mid]) {
                    left++;
                    continue;
                }
                
                
                else if (nums[mid] >= nums[left]) {
                    if (nums[left] <= target && target <= nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (nums[mid] <= target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
    
            return false;     
        }
    }
}

import java.util.*;
public class MissingNum {
    
    public static int  missingNumber(int[] nums) {
    
       int n = nums.length;
       int []  arr = new int[n+1];

       for (int i = 0; i < n ; i++) {
        arr[nums[i]]++;
       }
       for (int i = 0; i < arr.length; i++) {
        if (arr[i]==0) {
            return i;
        }
       }
       return -1;
    }


    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
       
    }
}

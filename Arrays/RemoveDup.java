// Remove Duplicates
import java.util.*;
public class RemoveDup {
    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    // public static int removeDuplicates(int[] nums) {
      
    //     int n = nums.length;
    //     // int [] arr = new int[n];
    //     ArrayList<Integer> list = new ArrayList<>();
        
    //         list.add(nums[0]);
    //         int k =1;
    //     for (int i = 1; i < n; i++) {
         
    //         if (list.contains(nums[i])) {
    //           i++;  
    //         }
    //         list.add(nums[i]);
    //     }
    //     System.out.println(list);
   
    //     return list.size();
    // }
    
    public static void main(String[] args) {
        
        int [] num = {1,1,2};
        System.out.println(removeDuplicates(num));
    }
}

public class MovesZero {

    public static void moveZeroes(int[] A) {
        int n = A.length;
       int[] B = new int[n];
       int j = 0;
       int count = 0;
       for (int i = 0; i < n; i++) {
           if (A[i] != 0) {
               B[j] = A[i];
               j++;
           }
           else {
               count++;
           }
       }
       while (count > 0) {
           B[j] = 0;
           count--;
           j++;
       }
       for (int i = 0; i < n; i++) {
           A[i] = B[i];
       }
   }


    // public static void moveZeroes(int[] nums) {
    //      int j =0;
    //     int count =0;
    //     int n = nums.length;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != 0) {
    //             nums[j]  = nums[i];
    //             j++;
    //             count++;
    //         }
    //     }
    //     int k = n-count;
      

    //     for (int i = 0; i < k; i++) {
    //          nums[n-1-i] =0;
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         System.out.print(nums[i]);
    //     }
    // }



    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}

public class RotateArr {
    

    public static void rotate(int[] nums, int k) {
       
       
        int arr[] = new int[nums.length];
        int n = nums.length;
    
        
            for (int j = 0; j < n; j++) {
                int c = (j+k)%n ;
             arr[c] = nums[j];
             
             }
        
     
        for (int i = 0; i < arr.length; i++) {
           nums[i]= arr[i];
        
       }
    }

    public static void main(String[] args) {
      
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        
    }
}

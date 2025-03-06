public class NextPrmutation {
    public static void reverse(int arr[] , int start){
        int i = start;
        int j  = arr.length-1;
        while(i<j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }
        }
       
           public void nextPermutation(int[] nums) {
               int n = nums.length;
                
                int idx =-1;
               for(int i = n-2 ; i>=0 ;i--){
                   if(nums[i]<nums[i+1]){
                       idx = i;
                       break;
                   }
               }
              if(idx == -1){
               reverse(nums,0);
              }
        else{
              for(int i = n-1; i>= idx ; i--){
               if(nums[i]>nums[idx]){
                   int temp = nums[i];
                   nums[i] = nums[idx];
                   nums[idx] = temp;
                   break;
               }
              }
       
           reverse(nums , idx+1);
           }
       
               
           }
}

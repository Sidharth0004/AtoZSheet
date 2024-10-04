// Max Consecutive Ones III
public class MaxConseOne {

//     public int longestOnes(int[] nums, int k) {
//         int n = nums.length-1;
//         int l=0;
//         int r = 0;
//         int maxlen =0 ;
//         int zeros =0;
  
//         while(r<n){
//           int num = nums[r];
//           if(num==0){
//              zeros++; 
//           }
//           while(zeros>k){
//               if(nums[l]==0){
//                   zeros--;
//                    }
//                   l++;
             
//           }
//           if(zeros<=k){
//               maxlen = Math.max(maxlen , r-l+1);
  
//           }
          
//           r=r+1;
  
//         }  
  
  
//   return maxlen;
  
//       }

class Solution {
    public int longestOnes(int[] nums, int k) {
      int n = nums.length;
      int l=0;
      int r = 0;
      int maxlen =0 ;
      int zeros =0;

      while(r<n){
        int num = nums[r];
        if(num==0){
           zeros++; 
        }
        if(zeros>k){
            if(nums[l]==0){
                zeros--;
                 }
                l++;
           
        }
        if(zeros<=k){
            maxlen = Math.max(maxlen , r-l+1);

        }
        
        r=r+1;

      }  


return maxlen;

    }
}
    
}

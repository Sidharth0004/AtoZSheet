package Stack;

import java.util.*;

public class NextGreater2 {
   
    
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int n = nums.length;
          int nxtGreater[]=new int[nums.length];
    
          for(int i =2*n-1 ; i>=0 ;i--){
    
       while(!s.isEmpty()  && nums[s.peek()] <= nums[i%n] ){
        s.pop();
       }
      if (i<n) {
                nxtGreater[i] = s.isEmpty()?-1:nums[s.peek()];
            }
    
          
      s.push(i%n);
    
          }  
    
    return nxtGreater;
    
    
        }
}

// public static void main(String[] args) {
//     int arr[] ={6,8,0,1,0,3};
//     Stack<Integer> s = new Stack<>();
//     int nxtGreater[]=new int[arr.length];

//     for (int i = arr.length-1; i >= 0; i--) {  
//         // 1 While
//         while (!s.isEmpty()  && arr[s.peek()] <= arr[i]) {
//             s.pop();
//         }
//         //2 if-else
//         if (s.isEmpty()) {
//             nxtGreater[i] = -1;
//         }
//         else{
//             nxtGreater[i]= arr[s.peek()];
//         }
//         s.push(i);
//     }
//     for (int i = 0; i < nxtGreater.length; i++) {
//         System.out.print(nxtGreater[i]+" ");
//     }
//    } 
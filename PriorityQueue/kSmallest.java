package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kSmallest {
      public static int kthSmallest(int[] nums, int k) {
        
        
        
     PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ; i<k ; i++){
            pq.add(nums[i]);
        }
     for(int i=k ; i<nums.length ; i++){
        if(pq.peek() > nums[i]){
            pq.poll();
            pq.add(nums[i]);
        }
     }
   return pq.peek();
    
    
    
    }
}

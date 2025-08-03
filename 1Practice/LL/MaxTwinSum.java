import java.util.ArrayList;

public class MaxTwinSum {
        public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();

        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        int n = arr.size();
      

        int i = 0;
        int j = n-1;
        int result = 0;

        while(i<j){
 result = Math.max(result , arr.get(i)+ arr.get(j));
 i++;
 j--;
        }

        return result;
        
    }
}

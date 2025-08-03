import java.util.HashMap;

public class RemoveZeroSum {
    
     public ListNode removeZeroSumSublists(ListNode head) {
         int preSum = 0;
         HashMap<Integer , ListNode> map = new HashMap<>();
         ListNode dummy = new ListNode(0);
         dummy.next = head;
         map.put(0 , dummy);

         while(head != null){
       preSum += head.val;

       if(map.containsKey(preSum)){
        ListNode p  = map.get(preSum);
        ListNode start = p;
        int sum = preSum;

        while(start != head){
            start = start.next;
            sum += start.val;
                    if (start != head) {
                        map.remove(sum);
                    }
        }
         p.next = start.next;
  }
else {
                map.put(preSum, head);
            }
            head = head.next;
         }
return dummy.next;
    }
}

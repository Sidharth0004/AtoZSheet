public class MergeNode {
   
    
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode(-1);
        ListNode resHead = res;
        ListNode curr = head.next;
         int sum = 0;

      while(curr != null){
       
            sum += curr.val;
           

            if(curr.val == 0 ){
                ListNode temp = new ListNode(sum);
                res.next = temp;
                res = res.next;
                sum = 0;
            }

            curr = curr.next;
      }
      return resHead.next;

    }
}

public class DoubleTheLL {
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
              return head;
          }
     ListNode curr = head;
     ListNode prev = null;
     ListNode next ;
  
     while(curr != null){
          next = curr.next;
          curr.next = prev;
  
          prev = curr;
          curr = next;
     }
     head = prev;
     return prev;
  
  
     }
  
      public ListNode doubleIt(ListNode head) {
        
  
    head = reverse(head);
    ListNode curr = head;
    ListNode prev = null;
    int carry = 0 ;
  
    while(curr != null){
      int newVal = curr.val*2 + carry;
      curr.val = newVal%10;
  
     if(newVal >= 10){
      carry = 1;
     }else{
      carry = 0;
     }
  
     prev = curr;
     curr = curr.next;
  
    }
    if(carry != 0){
      ListNode newHead = new ListNode(carry);
      prev.next = newHead;
    }
    return reverse(head);
  
      }
}

public class ReorderList {
    
 public static ListNode reverse(ListNode head){
    if(head == null || head.next == null){
        return head;
    }
    ListNode prev = null;
    ListNode curr = head;
    ListNode next;
 
 while(curr != null){
   next = curr.next;
   curr.next = prev;
   prev = curr;
   curr = next;

 }
head = prev;
return head;

 }


    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
   ListNode rev = reverse(slow);
   ListNode  curr = head;

   while(rev.next != null){
    ListNode tempCurr = curr.next;
    curr.next = rev;
    ListNode tempRev = rev.next;
    rev.next = tempCurr;
    curr = tempCurr;
    rev = tempRev;

   }

    }
}

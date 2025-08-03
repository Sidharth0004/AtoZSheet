public class findPosLoop {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        if(head==null || head.next == null ){
         return null;
        }
 
        while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (fast == slow) {
         cycle=true;
         break;
        }
    }
            if(cycle == false){
             return null;
            }
 
              slow = head;
           
           while (slow != fast) {
           
             slow = slow.next;
             fast = fast.next;
           }
 
   return slow;
 
     }
}

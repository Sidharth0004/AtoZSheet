public class PartitionList {
    
    public ListNode partition(ListNode head, int x) {
        
        if(head == null ){
           return null;
       }
       if(head.next == null){
           return head;
       }
   
     ListNode less = new ListNode(-1);
     ListNode more = new ListNode(-1);
   
     ListNode lessHead = less;
     ListNode moreHead = more;
   
   
    ListNode temp = head;
   
    while(temp != null){
     
     if(temp.val <x){
       less.next = temp;
       less = temp;
     }else {
       more.next = temp;
       more = temp;
     }
   temp = temp.next;
         
   }
   
      less.next  = moreHead.next;
      more.next = null;
   return lessHead.next;
   
   
       }
    
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

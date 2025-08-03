public class SwappingNodes {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1 = null;
        ListNode p2 = null;
   
        ListNode temp = head;
   
        while(temp != null){
   
           if(p2 != null){
               p2 = p2.next;
           }
    k--;
       if(k == 0){
           p1 = temp;
           p2 = head;
       }
      
   
       temp = temp.next;
   
        }
   
   
   int temp1 = p1.val;
   p1.val = p2.val;
   p2.val = temp1;
   return head;
   
           
       }
}

public class SplitLLinPart {

    public ListNode[] splitListToParts(ListNode head, int k) {    
        ListNode curr = head;
       int l = 0;
     
        while(curr!= null){
         l++;
         curr = curr.next;
        }
     
        int eachbuc = l/k;
        int rem = l%k;
        
       ListNode[] res = new ListNode[k];
     
        curr = head;
        ListNode prev = null;
     
        for(int i = 0 ; curr != null && i<k ; i++){
         res[i] = curr;
     
      for(int count = 1 ; count <= eachbuc +(rem >0 ? 1 :0) ; count ++){
         prev = curr;
         curr = curr.next;
      }
      if(prev != null){
         prev.next = null;
      }
     rem --;
        }
     return res;
         }
    
}
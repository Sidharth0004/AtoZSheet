import org.w3c.dom.Node;

public class LengthLoop {
        public int findLength(Node slow , Node fast){
         int cnt = 1;
        fast = fast.next;
                while(slow!=fast){
            
            cnt++;
            fast = fast.next;
        }
        

        return cnt;

    }
    
    public int countNodesinLoop(Node head) {
        Node slow = head;
        Node fast = head;
        
        if(head == null && head.next == null){
            return 0;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
               return findLength(slow, fast); 
            }
            
        }
        
        return 0 ;
        
        
    }
}

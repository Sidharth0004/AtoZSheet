public class RotateList {
    ListNode findNthNode(ListNode temp , int k){
        int cnt =1;
        while(temp!= null){
            if(cnt == k){
                return temp;
            }
            temp= temp.next;
            cnt++;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        int len = 1;
        ListNode tail = head;
 if (head == null || head.next == null) return head;
        while(tail.next != null){
       
            tail = tail.next;
                 len++;
        }

 if(k%len == 0) return head;
 k  = k%len;
 tail.next = head;

 ListNode newNode = findNthNode( head , len- k);
 head = newNode.next;
 newNode.next = null;
 return head;
    }
}

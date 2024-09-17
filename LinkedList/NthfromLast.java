//! Remove Nth Node From End of List

// public class NthfromLast {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int Length=0;
//         ListNode temp1 = head;
//           while (temp1!=null) {
//              temp1 = temp1.next;
//              Length++;
//          }
//      int nodeFromBeginning = Length - n + 1;
     
//      ListNode prev = null;
//      ListNode temp = head;
//      for (int i = 1; i < nodeFromBeginning; i++) {
//        prev = temp;
//        temp = temp.next;
//      }
//      if (prev == null) {
//        head = head.next;
//        return head;
//      }
//      else {
//        prev.next = prev.next.next;
//        return head;
//      } 
//      }

// }

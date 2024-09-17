public class Sortll {
//     public ListNode getMid(ListNode head){
//         ListNode slow = head;
//         ListNode fast = head.next;
//         while (fast != null  && fast.next != null) {
//             slow = slow.next;
//             fast= fast.next.next;
//         }
//         return  slow ; // mid
//      }

//       public ListNode merge (ListNode head1 , ListNode head2){
//         ListNode mergedLL = new ListNode(-1);
//         ListNode temp = mergedLL;
//         while (head1 != null && head2 != null) {
//             if (head1.val <= head2.val) {
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             }
//             else  {
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }
//         }

//         while (head1 != null) {
//              temp.next = head1;
//               head1 = head1.next;
//                 temp = temp.next;
//         }
//         while (head2 != null) {
//                temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//         }
//         return mergedLL.next;
//      }


//     public ListNode sortList(ListNode head) {
//       if ( head == null || head.next ==null) {
//             return head;
//         }
//  ListNode mid = getMid(head);
//           // left and right Ms
//           ListNode rightHead = mid.next;
//           mid.next = null;
//          ListNode newLeft=  sortList(head);
//          ListNode newRight = sortList(rightHead);

//          return merge (newLeft,newRight);





//     }
}

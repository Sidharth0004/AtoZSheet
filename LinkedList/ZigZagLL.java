public class ZigZagLL {
//     public void reorderList(ListNode head) {
//         ListNode slow  = head;
//         ListNode fast = head.next;
//         while(fast!=null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;

//         }
//        ListNode mid = slow;
   
//    ListNode curr = mid.next;
//    mid.next = null;
//    ListNode prev = null;
//    ListNode next;
//    while(curr != null){
//     next =curr.next;
//     curr.next = prev;
//        prev = curr;
//             curr = next;
//    }

//           ListNode left = head;
//           ListNode right = prev;
//           ListNode nextL ,nextR;

//              while (left != null && right != null) {
//              nextL =left.next;
//              left.next = right;
//                nextR = right.next;
//                 right.next =nextL;


//                 left = nextL;
//                 right = nextR;

//              }





//     }
}

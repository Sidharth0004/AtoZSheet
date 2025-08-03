package 1Practice.LL;

public class oddEven {
    Node divide(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node evenDummy = new Node(-1);
        Node oddDummy = new Node(-1);
        Node even = evenDummy, odd = oddDummy;

        while (head != null) {
            if (head.data % 2 == 0) {
                even.next = head;
                even = even.next;
            } else {
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
        }

        even.next = oddDummy.next;
        odd.next = null; // Ensure the last node of odd list points to null

        return evenDummy.next;
    }
}

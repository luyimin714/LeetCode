package LinkedList;

import java.util.List;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
//        if (head == null || head.next == null)
//            return head;
//        ListNode p = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return p;

//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null){
//            ListNode nextNode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextNode;
//        }
//        return prev;
    }
}

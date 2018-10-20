package LinkedList;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode prev = fakeHead, cur = head;
        while (cur != null){
            if (cur.val == val){
                prev.next = cur.next;
            }
            else
                prev = prev.next;
            cur = cur.next;
        }
        return fakeHead.next;
//        while(head != null && head.val == val){
//            head = head.next;
//        }
//        ListNode first = head;
//        while(head != null){
//            if(head.next != null){
//                if(head.next.val == val){
//                    head.next = head.next.next;
//                    continue;
//                }
//            }
//            head = head.next;
//        }
//        return first;
    }
}

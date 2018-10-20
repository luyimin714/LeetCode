package LinkedList;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode first = head;
        while (head != null){
            if (head.next == null)
                break;
            if (head.val == head.next.val)
                head.next = head.next.next;
            else head = head.next;
        }
        return first;
    }
}

package LinkedList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        int len = 1;
        ListNode count = head;
        ListNode delete = head;
        while(count.next != null){
            count = count.next;
            len++;
        }
        if(len == n)
            return head.next;
        int cur = 1;
        while(cur != (len-n)){
            delete = delete.next;
            cur++;
        }
        delete.next = delete.next.next;
        return head;
    }
}

package LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        int length = 1;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        while (cur.next != null){
            length++;
            cur = cur.next;
        }
        int step = k % length;
        for (int i = 0; i < length-step-1; i++){
            head = head.next;
        }
        cur.next = dummy.next;
        dummy.next = head.next;
        head.next = null;
        return dummy.next;
    }
}

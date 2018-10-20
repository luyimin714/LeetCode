package LinkedList;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode cur = head;
        ListNode next = null;
        ListNode helper = new ListNode(1);
        ListNode pre = helper;
        while(cur != null){
            next = cur.next;
            while(pre.next != null && pre.next.val < cur.val)
                pre = pre.next;
            cur.next = pre.next;
            pre.next = cur;
            pre = helper;
            cur = next;
        }
        return helper.next;
    }

    public static void main(String[] args) {
        ListNode helper = new ListNode(0);
        System.out.println("helper.val = " + helper.val);
        ListNode pre = helper;
        pre.val = 3;
        ListNode cur = new ListNode(2);
        pre.next = cur;
        System.out.println("helper.val = " + helper.val);
        System.out.println("helper.next.val = " + helper.next.val);
    }
}

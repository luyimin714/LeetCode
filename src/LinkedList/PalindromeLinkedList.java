package LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null)
            slow = slow.next;
        slow = reverseList(slow);
        fast = head;
        while (slow != null){
            if (fast.val != slow.val)
                return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
//        Stack<ListNode> stack = new Stack<>();
//        ListNode first = head;
//        while (first != null){
//            stack.push(first);
//            first = first.next;
//        }
//        while (head != null && !stack.isEmpty()){
//            if (head.val != stack.pop().val)
//                return false;
//            head = head.next;
//        }
//        return true;
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

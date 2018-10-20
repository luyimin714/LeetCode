package LinkedList;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val)
                    return -1;
                else if (o1.val == o2.val)
                    return 0;
                else return 1;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (ListNode node : lists){
            if (node != null) {
                queue.add(node);
            }
        }
        while (!queue.isEmpty()){
            tail.next = queue.poll();
            tail = tail.next;
            if (tail.next != null)
                queue.add(tail.next);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(10,new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                if (o1.val<o2.val)
                    return -1;
                else if (o1.val==o2.val)
                    return 0;
                else
                    return 1;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(3);
        p1.next = p2;
        p2.next = p3;
        //只加入quene 1个ListNode
        queue.add(p1);
        ListNode p4 = queue.poll();
        //ListNode p5 = queue.poll();//Exception in thread "main" java.lang.NullPointerException
        System.out.println(p4.val);
        tail.next = p4;
        tail = tail.next;
        if (tail.next != null)
            queue.add(tail.next);
        System.out.println(queue.poll().val);
        //Exception in thread "main" java.lang.NullPointerException
        //System.out.println(p5.val);
//        ListNode p4 = queue.poll();
//        System.out.println(p4.val);
//        System.out.println(p4.next.val);
//        System.out.println(p4.next.next.val);

    }
}

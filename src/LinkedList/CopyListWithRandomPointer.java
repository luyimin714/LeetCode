package LinkedList;

public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode iter = head;
        RandomListNode next;
        while (iter != null){
            next = iter.next;

            RandomListNode copy = new RandomListNode(iter.label);
            iter.next = copy;
            copy.next = next;

            iter = next;
        }
        iter = head;
        while (iter != null){
            if (iter.random != null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }
        iter = head;
        RandomListNode dummyHead = new RandomListNode(0);
        RandomListNode copy;
        RandomListNode copyIter = dummyHead;
        while (iter != null){
            next = iter.next.next;

            copy = iter.next;
            copyIter.next = copy;
            copyIter = copy;

            iter.next = next;

            iter = next;
        }
        return dummyHead.next;
    }
}

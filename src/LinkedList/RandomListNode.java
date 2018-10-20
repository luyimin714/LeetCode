package LinkedList;

public class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x){
        this.label = x;
    }

    public static void main(String[] args) {
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        node1.next = node2;
        node2.next = node3;
        node1.random = node3;
        node2.random = node1;
    }
}

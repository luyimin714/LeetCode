package DepthFirstSearch;

import Graph.UndirectedGraphNode;
import LinkedList.ListNode;

import java.util.HashMap;

public class CloneGraph {
    private HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null)
            return null;
        if (map.containsKey(node.label))
            return map.get(node.label);
        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(clone.label, clone);
        for (UndirectedGraphNode neighbor : node.neighbors){
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = one;
        System.out.println(two.val);
        one.val = 2;
        System.out.println(two.val);
    }
}

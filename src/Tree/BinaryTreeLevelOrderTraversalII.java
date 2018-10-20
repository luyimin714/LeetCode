package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return lists;
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null)
                    queue.add(queue.peek().left);
                if (queue.peek().right != null)
                    queue.add(queue.peek().right);
                list.add(queue.poll().val);
            }
            lists.add(0, list);
        }
        return  lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists1 = new LinkedList<>();
        List<Integer> list11 = new LinkedList<>();
        list11.add(11);
        list11.add(11);
        List<Integer> list12 = new LinkedList<>();
        list12.add(12);
        list12.add(12);
        lists1.add(0, list11);
        lists1.add(0, list12);

        List<List<Integer>> lists2 = new LinkedList<>();
        List<Integer> list21 = new LinkedList<>();
        list21.add(21);
        list21.add(21);
        List<Integer> list22 = new LinkedList<>();
        list22.add(22);
        list22.add(22);
        lists2.add(list21);
        lists2.add(list22);

        System.out.println(lists1);
        System.out.println(lists2);
    }
}

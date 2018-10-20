package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null){
            list.addFirst(root.val);
            if (root.left != null)
                stack.push(root.left);
            root = root.right;
            if (root == null && !stack.empty())
                root = stack.pop();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);list1.add(2);list1.add(3);
        list2.addFirst(1);list2.addFirst(2);list2.addFirst(3);
        for (int i = 0; i < list1.size(); i++)
            System.out.println(list1.get(i));
        for (int i = 0; i < list2.size(); i++)
            System.out.println(list2.get(i));
    }
}

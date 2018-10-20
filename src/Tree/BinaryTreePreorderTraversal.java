package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null){
            list.add(root.val);
            if (root.right != null)
                stack.push(root.right);
            root = root.left;
            if (root == null && !stack.empty())
                root = stack.pop();
        }
        return list;
    }
}

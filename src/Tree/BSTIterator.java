package Tree;

import java.util.Stack;

public class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        pushAll(temp.right);
        return temp.val;
    }

    private void pushAll(TreeNode node){
        while (node != null){
            stack.push(node);
            node = node.left;
        }
    }
}

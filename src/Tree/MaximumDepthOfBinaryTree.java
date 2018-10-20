package Tree;

import java.util.Stack;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        /****************************************
         * 深度优先搜索 基于堆栈
         ***************************************/
        if (root == null)
            return 0;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();
        stack.push(root);
        value.push(1);
        int max = 0;
        while (!stack.isEmpty()){
            TreeNode Node = stack.pop();
            int temp = value.pop();
            max = Math.max(max, temp);
            if (Node.left != null){
                stack.push(Node.left);
                value.push(temp+1);
            }
            if (Node.right != null){
                stack.push(Node.right);
                value.push(temp+1);
            }
        }
        return max;
//        if(root == null)
//            return 0;
//        else
//            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

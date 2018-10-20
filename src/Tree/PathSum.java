package Tree;

import java.util.Stack;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode pre = null, cur = root;
//        int SUM = 0;
//        while (cur != null || !stack.isEmpty()){
//            while (cur != null){
//                stack.push(cur);
//                SUM += cur.val;
//                cur = cur.left;
//            }
//            cur = stack.peek();
//            if (cur.left == null && cur.right == null && SUM == sum)
//                return true;
//            if (cur.right != null && pre != cur.right)
//                cur = cur.right;
//            else {
//                pre = cur;
//                stack.pop();
//                SUM -= cur.val;
//                cur = null;
//            }
//        }
//        return false;
        if(root == null)
            return false;
        if(root.left == null && root.right == null && sum - root.val == 0)
            return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}

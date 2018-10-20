package Tree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        /*********************************
         * 递归基怎么写？？？？？？？？？？？if的顺序
         *********************************/
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }
}

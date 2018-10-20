package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0);
        return list;
    }

    private void dfs(TreeNode cur, List<Integer> list, int depth){
        if (cur == null)
            return;
        if (list.size() == depth)
            list.add(cur.val);
        dfs(cur.right, list, depth+1);
        dfs(cur.left, list, depth+1);
    }
}

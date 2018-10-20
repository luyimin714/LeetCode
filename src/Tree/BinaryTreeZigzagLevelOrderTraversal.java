package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, ans, 0);
        return ans;
    }

    private void dfs(TreeNode cur, List<List<Integer>> ans, int depth){
        if (cur == null)
            return;

        if (ans.size() == depth){
            List<Integer> list = new LinkedList<>();
            ans.add(list);
        }

        if (depth % 2 == 0)
            ans.get(depth).add(cur.val);
        else
            ans.get(depth).add(0, cur.val);

        dfs(cur.left, ans, depth+1);
        dfs(cur.right, ans, depth+1);
    }
}

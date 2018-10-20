package Tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, ans, new ArrayList<>(), sum);
        return ans;
    }

    private void dfs(TreeNode cur, List<List<Integer>> ans, List<Integer> list, int res){
        if (cur == null)
            return;
        list.add(cur.val);
        if (cur.left == null && cur.right == null && cur.val == res) {
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        else{
            dfs(cur.left, ans, list, res-cur.val);
            dfs(cur.right, ans, list, res-cur.val);
        }
        list.remove(list.size()-1);
    }
}

package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), n, 1, k);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> list, int n, int start, int k){
        if (k == 0)
            ans.add(new ArrayList<>(list));
        else {
            for (int i = start; i <= n; i++){
                list.add(i);
                backtrack(ans, list, n, i+1, k-1);
                list.remove(list.size()-1);
            }
        }
    }
}

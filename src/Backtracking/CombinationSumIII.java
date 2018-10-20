package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), k, n, 1);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> list, int k, int remain, int start){
        if (k == 0 && remain == 0)
            ans.add(new ArrayList<>(list));
        else{
            for (int i = start; i <= 9; i++){
                list.add(i);
                backtrack(ans, list, k-1, remain-i, i+1);
                list.remove(list.size()-1);
            }
        }
    }
}

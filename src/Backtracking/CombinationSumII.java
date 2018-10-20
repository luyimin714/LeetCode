package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> list, int[] nums, int remain, int start){
        if(remain < 0)
            return;
        else if(remain == 0)
            ans.add(new ArrayList<>(list));
        else{
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i] == nums[i-1])
                    continue;
                list.add(nums[i]);
                backtrack(ans, list, nums, remain-nums[i], i+1);
                list.remove(list.size()-1);
            }
        }
    }
}

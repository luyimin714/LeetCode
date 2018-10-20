package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(lists, new ArrayList<>(), candidates, target, 0);
        return lists;
    }

    public void backtrack(List<List<Integer>> lists, List<Integer> templist, int[] nums, int remain, int start){
        if (remain < 0)
            return;
        else if (remain == 0)
            lists.add(new ArrayList<>(templist));
        else {
            for (int i = start; i < nums.length; i++){
                templist.add(nums[i]);
                backtrack(lists, templist, nums, remain-nums[i], i);
                templist.remove(templist.size()-1);
            }
        }
    }
}

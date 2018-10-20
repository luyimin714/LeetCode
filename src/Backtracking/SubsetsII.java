package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        backtrack(lists, new ArrayList<>(), nums, 0);
        return lists;
    }

    public void backtrack(List<List<Integer>> lists, List<Integer> list, int[] nums, int start){
        lists.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1])
                continue;
            list.add(nums[i]);
            backtrack(lists, list, nums, i+1);
            list.remove(list.size()-1);
        }
    }
}

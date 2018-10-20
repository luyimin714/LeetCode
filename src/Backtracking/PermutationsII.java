package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ans, new ArrayList<>(), nums, new boolean[nums.length]);
        return ans;
    }

    public void backtrack(List<List<Integer>> ans, List<Integer> list, int[] nums, boolean[] used){
        if (list.size() == nums.length)
            ans.add(new ArrayList<>(list));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i-1] && used[i-1])
                    continue;
                list.add(nums[i]);
                used[i] = true;
                backtrack(ans, list, nums, used);
                used[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}

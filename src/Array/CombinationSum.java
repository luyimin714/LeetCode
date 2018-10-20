package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if (remain < 0)
            return;
        if (remain == 0)
            list.add(tempList);
        for (int i = 0; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, remain - nums[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        Arrays.sort(candidates);
//        List<List<Integer>> list = new LinkedList<>();
//        for (int i = 0; i < candidates.length; i++){
//            if (candidates[i] == target)
//                list.add(Arrays.asList(candidates[i]));
//        }
//        for (int i = 0; i < candidates.length; i++){
//            int sum = candidates[i];
//            int minus = target - sum;
//            if (minus > candidates)
//            while (sum < target){
//
//            }
//        }
//        return list;
//    }
}

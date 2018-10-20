package Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.lang.Integer;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;   //避免第一个元素重复
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    while (lo < hi && nums[lo] == nums[lo + 1]) lo++;   //避免第二个元素重复
                    while (lo < hi && nums[hi] == nums[hi - 1]) hi--;   //避免第三个元素重复
                    lo++;
                    hi--;
                } else if (sum > 0)
                    hi--;
                else lo++;
            }
        }
        return list;
    }
}

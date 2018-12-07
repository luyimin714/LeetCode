package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int one = target - nums[i];
            if (map.containsKey(one)) {
                res[0] = map.get(one);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}

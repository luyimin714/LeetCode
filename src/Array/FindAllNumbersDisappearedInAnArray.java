package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0)
                nums[val] = -nums[val];
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0)
                result.add(i+1);
        }
        return result;
//        List<Integer> result = new ArrayList<>();
//        if (nums == null)
//            return result;
//        Arrays.sort(nums);
//        if (nums.length > 0 && nums[0] != 1){
//            int interval = nums[0] - 1;
//            for (int j = 1; j < interval; j++)
//                result.add(j);
//        }
//        for (int i = 0; i < nums.length-1; i++){
//            int interval = nums[i+1] - nums[i];
//            if (interval == 0 || interval == 1)
//                continue;
//            else {
//                for (int j = 1; j < interval;j++)
//                    result.add(nums[i]+j);
//            }
//        }
//        if (nums.length-1 >= 1 && nums[nums.length-1] != nums.length){
//            int interval = nums.length - nums[nums.length-1];
//            for (int j = 1; j < interval; j++)
//                result.add(nums[nums.length-1]+j);
//        }
//        return result;
    }
}

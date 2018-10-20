package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            if (set.contains(i))
                return true;
            set.add(i);
        }
        return false;
//        if (nums == null)
//            return false;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] < 0 || nums[i] > nums.length-1)
//                return false;
//        }
//        for (int i = 0; i < nums.length; i++){
//            while (nums[i] != i){
//                if (nums[i] == nums[nums[i]])
//                    return true;
//                int temp = nums[i];
//                nums[i] = nums[temp];
//                nums[temp] = temp;
//            }
//        }
//        return false;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++){
//            if (nums[i]==nums[i+1])
//                return true;
//        }
//        return false;
//        for (int i = 0; i < nums.length-1; i++){
//            for (int j = i+1; j < nums.length; j++){
//                if (nums[j] == nums[i])
//                    return true;
//            }
//        }
//        return false;
    }
}

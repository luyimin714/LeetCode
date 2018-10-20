package Array;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
//        int N = nums.length/2;
//        for (int i = 0; i < nums.length-1; i++){
//            int count = 1;
//            for (int j = i+1; j < nums.length; j++){
//                if (nums[j] == nums[i])
//                    count++;
//            }
//            if (count > N)
//                return nums[i];
//        }
//        return 0;
    }
}

package Array;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indice = new int[2];
        for (int lo = 0; lo < nums.length-1; lo++)
            for (int hi = nums.length-1; hi > lo; hi--){
                if(nums[lo] + nums[hi] == target){
                    indice[0] = lo;
                    indice[1] = hi;
                    break;
                }
            }

        for (int i = 0; i <= nums.length-2; i++)
            for (int j = i+1; j <= nums.length-1; j++)
                if (nums[i] + nums[j] == target){
                    indice[0] = i;
                    indice[1] = j;
                    break;
                }
        return indice;
    }
}

package Array;

import java.util.Arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = 0;
        for (int i = 1; i < nums.length; i++){
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(dp[i], max);
        }
        return max;
        //Arrays.sort(nums);
//        int sum = 0;
//        for (int i = nums.length-1; i >= 0; i--){
//            if (nums[i] >= 0)
//                sum += nums[i];
//            else break;
//        }
//        return sum;
    }
}

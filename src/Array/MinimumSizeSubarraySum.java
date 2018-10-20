package Array;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0)
            return 0;
        int left = 0, sum = 0, min_len = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= s){
                min_len = Math.min(min_len, i - left + 1);
                sum -= nums[left++];
            }
        }
        return min_len == Integer.MAX_VALUE ? 0 : min_len;
    }
}

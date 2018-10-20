package DynamicProgramming;

public class NumArray {
    private int[] sum;
    public NumArray(int[] nums) {
        sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            sum[i] = nums[i] + sum[i];
        }
    }

    public int sumRange(int i, int j) {
        return sum[j] - sum[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
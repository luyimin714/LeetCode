package Array;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int mid = nums.length - k;
        reverse(nums, 0, mid-1);
        reverse(nums, mid, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    public void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

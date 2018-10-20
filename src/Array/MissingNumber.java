package Array;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0)
            return 0;
        if (nums[nums.length-1] != nums.length)
            return nums.length;
        for (int i = 1; i < nums.length; i++){
            int next = nums[i-1] + 1;
            if (nums[i] != next)
                return next;
        }
        return -1;
//        int[] nums2 = new int[nums.length+1];
//        for (int i = 0; i < nums2.length; i++)
//            nums2[i] = 1;
//        for (int i = 0; i < nums.length; i++){
//            int val = Math.abs(nums[i]);
//            if (nums2[val] > 0)
//                nums2[val] = -nums2[val];
//        }
//        for (int i = 0; i < nums2.length; i++){
//            if (nums2[i] > 0)
//                return i;
//        }
//        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(4^(0^0)^(1^1)^(2^3)^(3^4));
    }
}

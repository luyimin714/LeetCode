package Array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums){
            if (num != 0){
                nums[index++] = num;
            }
        }
        while (index < nums.length)
            nums[index++] = 0;
//        int index = 0;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] != 0){
//                nums[index++] = nums[i];
//            }
//        }
//        while (index < nums.length)
//            nums[index++] = 0;
    }
//        int hi = nums.length-1;
//        for (int i = nums.length-2; i > 0; i--){
//            if (nums[i] == 0) {
//                for (int j = i; j < hi; j++)
//                    exchange(nums, j, j + 1);
//                hi--;
//            }
//        }
//    }
//    public void exchange(int[] nums, int i, int j){
//        int t = nums[i];
//        nums[i] = nums[j];
//        nums[j] = t;
//    }
}

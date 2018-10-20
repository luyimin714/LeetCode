package Array;

public class SortColors {
    public void sortColors(int[] nums) {
        int lo = 0, hi = nums.length-1;
        for(int i = 0; i <= hi; i++){
            while (nums[i] == 2 && i < hi){
                int temp = nums[i];
                nums[i] = nums[hi];
                nums[hi] = temp;
                hi--;
            }
            while (nums[i] == 0 && i > lo) {
                int temp = nums[i];
                nums[i] = nums[lo];
                nums[lo] = temp;
                lo++;
            }
        }
//        int num0 = 0, num1 = 0, num2 = 0;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] == 0)
//                num0++;
//            if (nums[i] == 1)
//                num1++;
//            if (nums[i] == 2)
//                num2++;
//        }
//        for (int i = 0; i < nums.length; i++){
//            if (i < num0)
//                nums[i] = 0;
//            else if (i >= num0 && i < num0 + num1)
//                nums[i] = 1;
//            else
//                nums[i] = 2;
//        }
    }
}

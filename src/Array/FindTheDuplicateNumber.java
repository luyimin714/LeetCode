package Array;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow =nums[0];
        int fast = nums[nums[0]];
        while (fast != slow){
            fast = nums[nums[fast]];
            slow = nums[slow];
        }
        fast = 0;
        while (fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
//        for (int lo = 0; lo < nums.length-1; lo++){
//            int hi = nums.length-1;
//            while (lo < hi){
//                if (nums[lo] == nums[hi])
//                    return nums[lo];
//                hi--;
//            }
//        }
//        return -1;
    }
}

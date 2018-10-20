package Array;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        for(int n : nums){
            if(len < 2 || n > nums[len-2]){
                nums[len] = n;
                len++;
            }
        }
        return len;
    }
}

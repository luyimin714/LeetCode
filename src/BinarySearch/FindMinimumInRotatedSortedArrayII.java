package BinarySearch;

public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        while(lo < hi){
            mid = (hi + lo) / 2;
            if(nums[mid] > nums[hi])
                lo = mid + 1;
            else if(nums[mid] < nums[hi])
                hi = mid;
            else
                hi--;
        }
        return nums[lo];
    }
}

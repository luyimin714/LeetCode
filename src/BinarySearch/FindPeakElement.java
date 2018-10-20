package BinarySearch;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length-1;
        while (lo < hi){
            int mid = (lo + hi) >> 1;
            if(nums[mid] > nums[mid+1])
                hi = mid;
            else
                lo = mid + 1;
        }
        return lo;
    }
}

package BinarySearch;

public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};
        if (nums.length == 0)
            return range;
        int lo = 0, hi = nums.length - 1;
        while (lo < hi){
            int mid = (lo + hi) / 2;
            if (nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        if (nums[lo] != target)
            return range;
        range[0] = lo;
        hi = nums.length - 1;
        while (lo < hi){
            int mid = (lo + hi) / 2 + 1;
            if (nums[mid] > target)
                hi = mid - 1;
            else
                lo = mid;
        }
        range[1] = hi;
        return range;
    }
}

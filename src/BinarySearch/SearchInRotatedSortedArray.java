package BinarySearch;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        while (lo < hi){
            int mid = (lo + hi) / 2;
            double num = (nums[mid] < nums[0]) == (target < nums[0]) ? nums[mid] : target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            if (num < target)
                lo = mid + 1;
            else if (num > target)
                hi = mid;
            else
                return mid;
        }
        return -1;
//        int lo = 0, hi = nums.length - 1;
//        while(lo < hi){
//            /***************************
//             *  7 8 9 1 2 3 4 5 6
//             *  4 5 6 7 8 9 1 2 3
//             ************************/
//            int mid = (lo + hi) / 2;
//            if (nums[mid] > nums[hi])
//                lo = mid + 1;
//            else
//                hi = mid;
//        }
//        int rot = lo;
//        lo = 0;
//        hi = nums.length - 1;
//        while(lo <= hi){
//            int mid = (lo + hi) / 2;
//            int realmid = (mid + rot) % nums.length;
//            if(nums[realmid] == target)
//                return realmid;
//            if (nums[realmid] < target)
//                lo = mid + 1;
//            else
//                hi = mid - 1;
//        }
//        return -1;
    }
}

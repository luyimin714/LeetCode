package Array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        while (lo <= hi){                       //边界问题
            int mid = lo + (hi - lo)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) hi = mid-1;
            else lo = mid + 1;
        }
        return lo;
    }
//        int index = 0;
//        for (int i = 1; i < nums.length+1; i++){
//            if (nums[i] == target) {
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }
}

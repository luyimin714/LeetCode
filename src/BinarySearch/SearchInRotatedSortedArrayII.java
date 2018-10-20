package BinarySearch;

public class SearchInRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] == target)
                return true;
            if((nums[lo] == nums[mid]) && nums[hi] == nums[mid]){
                lo++;
                hi--;
            }
            else if(nums[lo] <= nums[mid]){//检查左半部分是否有序
                if((nums[lo] <= target) && (nums[mid] > target))
                //若左半部分， 检查target是否位于左半边
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
            else{//右半部分有序
                if((nums[hi] >= target) && (nums[mid] < target))
                //若右半部分有序， 检查target是否位于右半边
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return false;
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] == target)
//                return true;
//        }
//        return false;
    }
}

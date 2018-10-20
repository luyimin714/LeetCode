package Array;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int lo = 0, hi = n * m - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (matrix[mid / m][mid % m] < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        return matrix[hi / m][hi % m] == target;
    }
//    public int search(int[] nums, int target){
//        int lo = 0, hi = nums.length-1;
//        while (lo <= hi){
//            int mid = lo + (hi - lo) / 2;
//            if (nums[mid] < target)
//                lo = mid + 1;
//            else if (nums[mid] > target)
//                hi = mid - 1;
//            else
//                return nums[mid];
//        }
//        return -1;
//    }
}

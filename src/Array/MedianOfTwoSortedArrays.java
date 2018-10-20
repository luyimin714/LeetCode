package Array;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int N = nums1.length + nums2.length;
        int[] nums = new int[N/2 + 1];
        int i = 0, j = 0, k = 0;
        while ((i+j) < N/2 + 1){
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j])
                    nums[k++] = nums1[i++];
                else nums[k++] = nums2[j++];
            }
            else if (i < nums1.length && j == nums2.length)
                nums[k++] = nums1[i++];
            else if (i == nums1.length && j < nums2.length)
                nums[k++] = nums2[j++];
        }
        if (N % 2 == 0)
            return (double)(nums[(N/2) - 1] + nums[N/2])/2;
        else return nums[N/2];
//        int[] nums = new int[nums1.length+nums2.length];
//        int i = 0, j = 0, k = 0;
//        while (i < nums1.length && j <nums2.length){
//            if (nums1[i] < nums2[j])
//                nums[k++] = nums1[i++];
//            else nums[k++] = nums2[j++];
//        }
//        while (i < nums1.length)
//            nums[k++] = nums1[i++];
//        while (j < nums2.length)
//            nums[k++] = nums2[j++];
//
//        if (nums.length % 2 == 0)
//            return (double)(nums[(nums.length/2) - 1] + nums[nums.length/2])/2;
//        else return nums[nums.length/2];
    }
}

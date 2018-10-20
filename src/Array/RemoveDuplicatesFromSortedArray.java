package Array;

public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i])
                i++;
            nums[i] = nums[j];
        }
        return i + 1;
    }
//    public int removeDuplicates(int[] nums) {
//        int length = nums.length;
//        for (int i = 0; i < nums.length; i++){
//            for (int j = i+1; j < nums.length; j++){
//                if (nums[j] == nums[i]){
//                    length--;
//                    continue;
//                }
//                else break;
//            }
//        }
//        return length;
//    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        for ( int i : nums )
            System.out.print(nums[i]);
        System.out.println();
        RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        for ( int i : nums )
            System.out.print(nums[i]);
    }
}

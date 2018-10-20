package Array;

public class RemoveElement {
    private static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        for (int i : nums )
            System.out.print(nums[i]);
        int val = 3;
        System.out.println();
        RemoveElement.removeElement(nums, val);
        for (int i : nums )
            System.out.print(nums[i]);
    }
}

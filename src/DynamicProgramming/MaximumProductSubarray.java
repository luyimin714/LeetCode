package DynamicProgramming;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int r = nums[0];

        for (int i = 1, imax = r, imin = r; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }

            imax = Math.max(nums[i], imax * nums[i]);
            imin = Math.min(nums[i], imin * nums[i]);

            r = Math.max(r, imax);
        }
        return r;
    }

    private static void swap (int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println(a);
        System.out.println(b);
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }
}

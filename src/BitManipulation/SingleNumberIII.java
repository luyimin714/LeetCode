package BitManipulation;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums){
            diff ^= num;
        }
        diff = diff & (-diff);
        //因为int整数在java中是按照补码的方式来的,
        //那么正数和它负值按位与的结果是原始最右边非0位的数字为1，其余位都为0；
        int[] ans = {0, 0};
        for (int num : nums){
            if ((num & diff) == 0)
                ans[0] ^= num;
            else
                ans[1] ^= num;
        }
        return ans;
    }
}

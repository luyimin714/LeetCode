package Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums.length == 0)
            return ans;
        int count1 = 0, count2 = 0;
        int num1 = nums[0],num2 = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == num1)
                count1++;
            else if (nums[i] == num2)
                count2++;
            else if (count1 == 0){
                num1 = nums[i];
                count1++;
            }
            else if(count2 == 0){
                num2 = nums[i];
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == num1)
                count1++;
            else if (nums[i] == num2)
                count2++;
        }
        if (count1 > nums.length / 3)
            ans.add(num1);
        if (count2 > nums.length / 3)
            ans.add(num2);
        return ans;
    }
}

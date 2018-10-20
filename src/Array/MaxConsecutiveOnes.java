package Array;

import java.util.Arrays;
import java.util.LinkedList;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxNum =  0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count++;
                maxNum = Math.max(maxNum,count);
            }
            else
                count = 0;

        }
        return maxNum;
//        int count = 0;
//        int maxNum =  0;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] == 1){
//                count++;
//                if(i+1 >= nums.length)
//                    maxNum = Math.max(maxNum,count);
//            }
//            else {
//                maxNum = Math.max(maxNum,count);
//                count = 0;
//            }
//        }
//        return maxNum;
    }
}

package Array;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length-1;
        for(int i = nums.length-1; i >= 0 ;i--){
            if(i + nums[i] >= lastPos)
                lastPos = i;
        }
        return lastPos == 0;
//        int i = 0;
//        int n = nums.length;
//        for (int reach = 0; i < n && i <= reach; i++){
//            reach = Math.max(i + nums[i], reach);
//        }
//        return i == n;
    }
}

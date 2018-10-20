package Array;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //暴力解法，超时！！！！！！！！！！！！！！！！！！！！！！！！用HashSet
        for (int i = 0; i < nums.length-k; i++)
            for (int j = i + 1; j < k && j < nums.length; j++)
                if (nums[i] == nums[j])
                    return true;
        return false;
    }
}

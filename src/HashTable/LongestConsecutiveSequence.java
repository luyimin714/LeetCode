package HashTable;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if (!map.containsKey(num)){
                int left = map.containsKey(num-1) ? map.get(num-1) : 0;
                int right = map.containsKey(num+1) ? map.get(num+1) : 0;
                int sum = left + right + 1;

                ans = Math.max(sum, ans);
                map.put(num - left, sum);
                map.put(num + right, sum);
            }
            else
                continue;
        }
        return ans;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = map.get(2);
        System.out.println(left);
    }
}

package HashTable;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            boolean index = set.add(nums[i]);
            if(index == false)
                set.remove(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i]))
                return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(5^1);
        System.out.println('B'-'A');
    }
}

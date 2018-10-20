package Array;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int i : nums1)
            set.add(i);
        for (int i : nums2) {
            if (set.contains(i))
                intersection.add(i);
        }
        int[] res = new int[intersection.size()];
        int i = 0;
        for (Integer num : intersection)
            res[i++] = num;
        return res;
    }
}

package BinarySearchTree;

import java.util.TreeSet;

public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0)
            return false;
        TreeSet<Long> treeSet = new TreeSet<>();
        for (int i = 0; i < nums.length; i++){
            long l = (long)nums[i];
            //floor(E e) 方法返回在这个集合中小于或者等于给定元素的最大元素，如果不存在这样的元素,返回null.
            //ceiling(E e) 方法返回在这个集合中大于或者等于给定元素的最小元素，如果不存在这样的元素,返回null.
            Long floor = treeSet.floor(l);
            Long ceil = treeSet.ceiling(l);
            if ((floor != null && l - floor <= t)
                 || (ceil != null && ceil - l <= t))
                return true;
            treeSet.add(l);
            if (i >= k){
                treeSet.remove((long)nums[i-k]);
            }
        }
        return false;
    }
}

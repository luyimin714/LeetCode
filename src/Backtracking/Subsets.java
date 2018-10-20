package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        for(int i : nums){
            List<List<Integer>> temp = new ArrayList<>();
            for(List<Integer> sub : lists){
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                temp.add(a);
            }
            lists.addAll(temp);
        }
        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list2.add(2);
        list2.add(3);
        temp.add(list1);
        temp.add(list2);
        lists.addAll(temp);
        System.out.println(lists);
    }
}

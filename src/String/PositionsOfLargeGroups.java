package String;

import java.util.*;

public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String S) {
        char[] s = S.toCharArray();
        List<List<Integer>> lists = new LinkedList<>();
        int count = 1;
        List<Integer> list = new LinkedList<>();
        int start=0, end=1;
        while(start < s.length && end < s.length){
            if(s[start] == s[end]){
                count++;
                end++;
                if(end == s.length && count >=3){
                    list.add(start);
                    list.add(end-1);
                    lists.add(list);
                }
            }
            else{
                if(count >= 3){
                    list.add(start);
                    list.add(end-1);
                    lists.add(list);
                }
                count = 1;
                list = new LinkedList<>();
                start = end;
                end++;
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        char a = 'a';
        char b = 'a';
        System.out.println(a == b);
    }
}

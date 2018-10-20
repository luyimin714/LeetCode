package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int i : counter){
            if (i != 0)
                return false;
        }
        return true;
//        char[] s1 = s.toCharArray();
//        char[] t1 = t.toCharArray();
//        Arrays.sort(s1);
//        Arrays.sort(t1);
//        return Arrays.equals(s1, t1);
    }

    public static void main(String[] args) {
        System.out.println('c'-'a');
    }
}

package HashTable;

import java.util.HashSet;
import java.util.Set;

/*

 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i = 0, j = 0;
        int N = s.length();
        Set<Character> set = new HashSet<>();
        while (i < N && j < N){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            }
            else
                set.remove(s.charAt(i++));
        }
        return ans;
    }
}

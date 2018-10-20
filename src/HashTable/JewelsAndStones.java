package HashTable;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for (char c : J.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for (char c : S.toCharArray()){
            if(set.contains(c))
                count++;
        }
        return count;
//        Set<Character> set = new HashSet<>();
//        for (int i = 0; i < J.length(); i++){
//            set.add(J.charAt(i));
//        }
//        int count = 0;
//        for (int i = 0; i < S.length(); i++){
//            if(set.contains(S.charAt(i)))
//                count++;
//        }
//        return count;
    }
}

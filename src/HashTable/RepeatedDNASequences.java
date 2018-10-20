package HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> once = new HashSet<>();
        Set<Integer> twice = new HashSet<>();
        List<String> ans = new ArrayList<>();
        char[] map = new char[26];
        map['A' - 'A'] = 0; //00
        map['T' - 'A'] = 1; //01
        map['C' - 'A'] = 2; //10
        map['G' - 'A'] = 3; //11
        for (int i = 0; i < s.length()-9; i++){
            int v = 0;
            for (int j = i; j < i+10; j++){
                v <<= 2;
                v |= map[s.charAt(j) - 'A'];
            }
            /*
            &&前面是0时,&&符号后面的不计算.
            ||前面不是0时,||号后面的不计算.
             */
            if (!once.add(v) && twice.add(v))
                ans.add(s.substring(i, i+10));
        }
        return ans;
    }

    public static void main(String[] args) {
        int v = 0;
        System.out.println(v <<= 2);
        System.out.println(v |= 2);
        System.out.println(v <<= 2);
        System.out.println(v |= 3);
        System.out.println(v <<= 2);
        System.out.println(v |= 1);
        System.out.println(!true && false);
        System.out.println(!(true && false));
    }
}

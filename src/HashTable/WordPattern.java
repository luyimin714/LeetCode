package HashTable;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if (pattern.length() != strings.length)
            return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            if (map.containsKey(pattern.charAt(i))){
                if (!map.get(c).equals(strings[i]))
                    return false;
            }
            else {
                if (map.containsValue(strings[i]))
                    return false;
                map.put(c, strings[i]);
            }
        }
        return true;
//        Map map = new HashMap<>();
//        for (Integer i = 0; i < pattern.length(); i++){
//            if (map.put(pattern.charAt(i), i) != map.put(strings[i], i))
//                return false;
//        }
//        return true;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap();
        System.out.println(map.put(1,1));
        System.out.println(map.put(1,1));
        System.out.println(map.put(1,3));
        System.out.println(map.put(2,1));
        System.out.println(map.get(1));
        int i = 10;
        Integer a = i;
        Integer b = i;
        System.out.println(a == b);
    }
}

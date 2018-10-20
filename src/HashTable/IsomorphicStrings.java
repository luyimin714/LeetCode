package HashTable;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char Key = s.charAt(i);
            char Value = t.charAt(i);
            if (map.containsKey(Key)){
                if (map.get(Key).equals(Value))
                    continue;
                else return false;
            }
            else {
                if (!map.containsValue(Value))
                    map.put(Key, Value);
                else
                    return false;
            }
        }
        return true;
    }
}

package String;

import java.util.Arrays;

public class ReverseString {
    public static String reverseString(String s) {
        char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            c[s.length()-i-1] = s.charAt(i);
        }

        //字符数组转字符串
        String s1 = new String(c);
        return s1;
    }
}

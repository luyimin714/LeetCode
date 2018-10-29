package String;

public class LongestPalindromicSubstring {
    private int start, maxlen;
    public String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        for (int i = 0; i < s.length() - 1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        return s.substring(start, start + maxlen);
    }

    private void extendPalindrome(String s, int lo, int hi) {
        while (0 <= lo && hi < s.length() && s.charAt(lo) == s.charAt(hi)) {
            lo--;
            hi++;
        }
        if (hi - lo - 1 > maxlen) {
            start = lo + 1;
            maxlen = hi - lo - 1;
        }
    }
}

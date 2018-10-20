package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), s, 0);
        return ans;
    }

    public void backtrack(List<List<String>> ans, List<String> list, String s, int start){
        if (start == s.length())
            ans.add(new ArrayList<>(list));
        else{
            for(int i = start; i < s.length(); i++){
                if (isPalindrome(s, start, i)){
                    list.add(s.substring(start, i+1));
                    backtrack(ans, list, s, i+1);
                    list.remove(list.size()-1);
                }
            }
        }
    }

    public boolean isPalindrome(String s, int lo, int hi){
        while(lo < hi) {
            if (s.charAt(lo++) != s.charAt(hi--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(s.substring(0, 1));
    }
}

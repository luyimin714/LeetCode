package String;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
//        LinkedList<String> list = new LinkedList<>();
//        if(digits.isEmpty()) return list;
//        String[] mapping = {"0", "1", "abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        list.add("");
//        for(int i = 0; i < digits.length(); i++){
//            int digit = digits.charAt(i) - '0';
//            while(list.peek().length() == i){
//                String temp = list.remove();
//                for(char c : mapping[i].toCharArray()){
//                    list.add(temp+c);
//                }
//            }
//        }
//        return list;
    }

    public static void main(String[] args) {
        System.out.println('6' - '0');
        System.out.println(Character.getNumericValue('6'));
        System.out.println("sss".isEmpty());
    }
}

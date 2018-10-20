package String;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        if(chars.length == 0)
            return 0;
        int count = 0;
        int i = chars.length-1;
        while(chars[i] == ' ' && i > 0) i--;
        while(i >= 0){
            if(chars[i] != ' '){
                count++;
                i--;
            }
            else break;
        }
        return count;
        // int count = 0, i = s.length()-1;
        // char[] chars = s.toCharArray();
        // while(i >= 0 && chars[i] == ' ') i--;
        // while(i >= 0 && chars[i] != ' '){
        //     count++;
        //     i--;
        // }
        // return count;
    }
}

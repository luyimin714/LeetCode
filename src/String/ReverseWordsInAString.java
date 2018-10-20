package String;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int j = s.length();
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) == ' ')
                j = i;
            else if (i == 0 || s.charAt(i-1) == ' '){
                if (stringBuilder.length() != 0)
                    stringBuilder.append(' ');
                stringBuilder.append(s.substring(i, j));
            }
        }
        return stringBuilder.toString();
    }
}

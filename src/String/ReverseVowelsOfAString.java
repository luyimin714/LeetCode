package String;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0)
            return s;
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0, end = chars.length-1;
        while (start < end){
            //The .contains method is checking for string within a string.
            //By adding the double quotes to the char, it is making that char into a string.
            while (start < end && !vowels.contains(chars[start]+"")) //将char转换为String
                start++;
            while (start < end && !vowels.contains(chars[end]+""))
                end--;

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++; end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = ""; //长度为0
        System.out.println(s.length());
        String s1 = null;
        System.out.println(s1.length());//异常
    }
}

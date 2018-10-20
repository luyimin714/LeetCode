package String;

public class ValidNumber {
    //trim()方法返回调用字符串对象的一个副本，
    //但是所有起始和结尾的空格都被删除了
    public boolean isNumber(String s) {
        s = s.trim();

        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;
        for (int i = 0; i < s.length(); i++){
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                numberSeen = true;
                numberAfterE = true;
            }
            else if (s.charAt(i) == '.'){
                if (eSeen || pointSeen)
                    return false;
                pointSeen = true;
            }
            else if (s.charAt(i) == 'e'){
                if (eSeen || !numberSeen)
                    return false;
                numberAfterE = false;
                eSeen = true;
            }
            else if (s.charAt(i) == '-' || s.charAt(i) == '+'){
                if (i != 0 && s.charAt(i-1) != 'e')
                    return false;
            }
            else {
                return false;
            }
        }
        return numberSeen && numberAfterE;
    }
}

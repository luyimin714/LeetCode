package String;

public class StringToInteger {
    public int myAtoi(String str) {
        if (str.length() == 0)
            return 0;
        int start = 0, sum = 0, sign = 1;
        while (start < str.length() && str.charAt(start) == ' ')
            start++;
        if (str.charAt(start) == '+' || str.charAt(start) == '-'){
            sign = str.charAt(start) == '+' ? 1 : -1;
            start++;
        }
        while (start < str.length()){
            int digit = str.charAt(start) - '0';
            if (digit < 0 || digit > 9)
                break;
            if (Integer.MAX_VALUE/10 < sum || (sum == Integer.MAX_VALUE/10 && Integer.MAX_VALUE % 10 < digit))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            sum = sum * 10 + digit;
            start++;
        }
        return sign * sum;
//        if (str.length() == 0)
//            return 0;
//        int start = 0, sign = 1;
//        while (start < str.length() && str.charAt(start) == ' ')
//            start++;
//        if (str.charAt(start) == '+' || str.charAt(start) == '-') {
//            sign = str.charAt(start) == '+' ? 1 : -1;
//            start++;
//        }
//        int sum = 0;
//        while (start < str.length()){
//            int num = str.charAt(start) - '0';
//            if (num < 0 || num > 9)
//                break;
//            if(Integer.MAX_VALUE/10 < sum || Integer.MAX_VALUE/10 == sum && Integer.MAX_VALUE %10 < num)
//                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//            sum = sum * 10 + num;
//            start++;
//        }
//        return sign * sum;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

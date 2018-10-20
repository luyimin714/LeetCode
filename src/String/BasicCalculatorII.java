package String;

import java.util.Stack;

public class BasicCalculatorII {
    public int calculate(String s) {
        if(s == null || s.length() == 0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        int num = 0 , len = s.length();
        char sign = '+';
        for(int i = 0; i < len; i++){
            if(Character.isDigit(s.charAt(i)))
                num = num * 10 + (s.charAt(i) - '0');
            if((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || i == len-1){
                if(sign == '+')
                    stack.push(num);
                else if(sign == '-')
                    stack.push(-num);
                else if(sign == '*')
                    stack.push(stack.pop() * num);
                else if(sign == '/')
                    stack.push(stack.pop() / num);
                sign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        for(int i : stack)
            ans += i;
        return ans;
    }
}
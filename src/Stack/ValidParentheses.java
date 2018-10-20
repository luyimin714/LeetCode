package Stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (c == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if (c == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else if (c == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else return false;
        }
        return stack.empty();
    }
//        Stack<Character> stack = new Stack<Character>();
//        int N = s.length();
//        for (int i = 0; i < N; i++){
//            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
//                stack.push(s.charAt(i));
//            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
//                if (stack.isEmpty())
//                    return false;
//                char pop = stack.pop();
//                if (pop == '(') {
//                    if (s.charAt(i) == ')')
//                        continue;
//                    else return false;
//                }
//                if (pop == '[') {
//                    if (s.charAt(i) == ']')
//                        continue;
//                    else return false;
//                }
//                if (pop == '{') {
//                    if (s.charAt(i) == '}')
//                        continue;
//                    else return false;
//                }
//            }
//        }
//        if (!stack.isEmpty())
//            return false;
//        return true;
//    }
}

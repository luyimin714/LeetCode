package DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '+'){
                String part1 = input.substring(0, i);
                String part2 = input.substring(i+1);//substring(x)是从字符串的的第x个字符截取
                List<Integer> part1Ret = diffWaysToCompute(part1);
                List<Integer> part2Ret = diffWaysToCompute(part2);
                for (Integer p1 : part1Ret){
                    for (Integer p2 : part2Ret){
                        int c = 0;
                        switch (input.charAt(i)){
                            case '+' : c = p1 + p2;break;
                            case '-' : c = p1 - p2;break;
                            case '*' : c = p1 * p2;break;
                        }
                        ans.add(c);
                    }
                }
            }
        }
        if (ans.size() == 0)
            ans.add(Integer.valueOf(input));
        return ans;
    }
}

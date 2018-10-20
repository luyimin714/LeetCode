package Backtracking;

import java.math.BigInteger;

public class AdditiveNumber{
    public boolean isAdditiveNumber(String num){
        int n = num.length();
        for (int i = 1; i <= (n-1)/2; i++){
            if (num.startsWith("0") && i >= 2)
                break;
            for (int j = i+1; (n-j) >= i && (n-j) >= j-i; j++){
                if (num.charAt(i) == '0' && j-i >= 2)
                    break;
                long num1 = Long.parseLong(num.substring(0,i));
                long num2 = Long.parseLong(num.substring(i,j));
                if (isValid(num.substring(j), num1, num2))
                    return true;
            }
        }
        return false;
    }

    private boolean isValid(String remain, long num1, long num2){
        if (remain.equals(""))
            return true;
        long sum = num1 + num2;
        String sumStr = "" + sum;
        if (!remain.startsWith(sumStr))
            return false;
        return isValid(remain.substring(sumStr.length()), num2, sum);
    }
}
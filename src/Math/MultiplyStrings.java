package Math;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] ans = new int[m+n];
        for (int i = m-1; i >= 0; i--){
            for (int j = n - 1; j >= 0; j--){
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + ans[p2];

                ans[p1] = ans[p1] + sum / 10;
                ans[p2] = sum % 10;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i : ans){
            if (!(res.length() == 0 && i == 0))
                res.append(i);
        }
        return (res.length() == 0) ? "0" : res.toString();
    }
}

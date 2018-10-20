package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        StringBuilder ans = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int[] factorial = new int[n+1];
        int sum = 1;
        factorial[0] = 1;
        for (int i = 1; i <= n; i++){
            sum *= i;
            factorial[i] = sum;
        }
        for (int i = 1; i <= n; i++)
            list.add(i);
        k--;
        for (int i = 1; i < n; i++){
            int index = k / factorial[n-i];
            ans.append(String.valueOf(list.get(index)));
            list.remove(index);
            k -= index * factorial[n-i];
        }
        return ans.toString();
    }
}

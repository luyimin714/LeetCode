package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < 2*n; i++){
            ans.add(i ^ i >> 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(1 << 5);
        System.out.println(5 << 1);
        System.out.println(1 << 2);
    }
}

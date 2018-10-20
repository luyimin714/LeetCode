package BUPT_OJ;

import java.util.Scanner;
import java.util.Stack;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();
        getLCS(x,y);
    }

    public static void getLCS(String x, String y){

        char[] s1 = x.toCharArray();
        char[] s2 = y.toCharArray();
        int[][] arrays = new int[x.length()+1][y.length()+1];

        for(int j = 0; j < arrays[0].length; j++){
            arrays[0][j] = 0;
        }
        for(int i = 0; i < arrays.length; i++){
            arrays[i][0] = 0;
        }

        for(int m = 1; m < arrays.length; m++){
            for(int n = 1; n < arrays[m].length; n++){
                if(s1[m - 1] == s2[n - 1]){
                    arrays[m][n] = arrays[m-1][n-1] + 1;
                }else{
                    arrays[m][n] = max(arrays[m -1][n], arrays[m][n -1]);
                }
            }
        }

        Stack stack = new Stack();
        int i = x.length() - 1;
        int j = y.length() - 1;

        while((i >= 0) && (j >= 0)){
            if(s1[i] == s2[j]){
                stack.push(s1[i]);
                i--;
                j--;
            }else{
                if(arrays[i+1][j] > arrays[i][j+1]){
                    j--;
                }else{
                    i--;
                }
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

    public static int max(int a, int b){
        return (a > b)? a : b;
    }
}

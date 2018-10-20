package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queens {
    public List<List<String>> solveNQueens(int n) {
        char[][] ch = new char[n][n];
        for(char[] c : ch){
            Arrays.fill(c, '.');
        }
        List<List<String>> ans = new ArrayList<>();
        backtracking(ans, 0, ch);
        return ans;
    }

    private void backtracking(List<List<String>> ans, int n, char[][] ch){
        if(n == ch.length){
            List<String> list = new ArrayList<>();
            for(char[] c : ch){
                list.add(new String(c));
            }
            ans.add(list);
        } else{
            for(int i = 0; i < ch.length; i++){
                if(isValid(ch, n, i)){
                    backtracking(ans, n+1, ch);
                    ch[n][i] = '.';
                }
            }
        }
    }

    private boolean isValid(char[][] ch, int row, int col){
        for(int i = 0; i < ch.length; i++){
            if(ch[row][i] == 'Q' || ch[i][col] == 'Q')
                return false;
            if(row+col-i >= 0 && row+col-i < ch.length){
                if(ch[i][row+col-i] == 'Q')
                    return false;
            }
            if(col-row+i >= 0 && col-row+i < ch.length){
                if(ch[i][col-row+i] == 'Q')
                    return false;
            }
        }
        ch[row][col] = 'Q';
        return true;
    }
}

package DepthFirstSearch;

public class SurroundedRegions {
    public void solve(char[][] board) {
        if (board.length == 0)
            return;
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++){
            dfs(board, i, 0, row, col); //左边界
            dfs(board, i, col-1, row, col); //右边界
        }
        for (int j = 0; j < col; j++){
            dfs(board, 0, j, row, col); //上边界
            dfs(board, row-1, j, row, col); //下边界
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++)
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (board[i][j] == '1')
                    board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] vec, int i, int j, int row, int col){
        if (vec[i][j] == 'O'){
            vec[i][j] = '1';
            if (i > 1)
                dfs(vec, i-1, j, row, col);
            if (j > 1)
                dfs(vec, i, j-1, row, col);
            if (i < row - 1)
                dfs(vec, i+1, j, row, col);
            if (j < col - 1)
                dfs(vec, i, j+1, row, col);
        }
    }
}

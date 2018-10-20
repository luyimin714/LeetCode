package DepthFirstSearch;

public class NumberOfIslands {
    private int row;
    private int col;
    public int numIslands(char[][] grid) {
        if (grid.length == 0)
            return 0;
        int count = 0;
        row = grid.length;
        col = grid[0].length;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j){
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == '0')  //递归基怎么写
            return;
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }

    private static int a;
    public static void main(String[] args) {
        System.out.println(a);
    }
}

package DynamicProgramming;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        //使用一维数组dp，一行一行的刷新
        int[] dp = new int[n];
        //Arrays.fill(dp, 1);
        dp[0] = 1;
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                dp[j] += dp[j-1];
            }
        }
        return dp[n-1];
    }

    public int uniquePathsNaive(int m, int n) {
        int[][] path = new int[m][n];
        for (int[] i : path)
            Arrays.fill(i, 1);
        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                path[i][j] = path[i-1][j] + path[i][j-1];
            }
        }
        return path[m-1][n-1];
    }
}

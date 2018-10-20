package DynamicProgramming;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int col = obstacleGrid[0].length;
        int[] dp = new int[col];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int i = 0; i < col; i++) {
                if (row[i] == 1)
                    dp[i] = 0;
                else if (i > 0)
                    dp[i] += dp[i-1];
            }
        }
        return dp[col - 1];
    }
}

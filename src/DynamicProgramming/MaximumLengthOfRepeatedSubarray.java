package DynamicProgramming;

public class MaximumLengthOfRepeatedSubarray {
    /*
     * 718. 最长重复子数组
     * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
     */
    public int findLength(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int[][] c = new int[m + 1][n + 1];
        int max = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A[i-1] == B[j-1])
                    c[i][j] = c[i-1][j-1] + 1;
                else
                    c[i][j] = 0;

                max = Math.max(max, c[i][j]);
            }
        }
        return max;
    }
}

package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int colBegin = 0, colEnd = n-1;
        int rowBegin = 0, rowEnd = n-1;

        int num = 1;
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin; i <= colEnd; i++)
                ans[rowBegin][i] = num++;
            rowBegin++;

            for(int i = rowBegin; i <= rowEnd; i++)
                ans[i][colEnd] = num++;
            colEnd--;

            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--)
                    ans[rowEnd][i] = num++;
            }
            rowEnd--;

            if(colBegin <= colEnd){
                for(int i = rowEnd; i >= rowBegin; i--)
                    ans[i][colBegin] = num++;
            }
            colBegin++;
        }
        return ans;
    }
}

package Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0)
            return ans;
        int rowBegin = 0, rowEnd = matrix.length-1;
        int colBegin = 0, colEnd = matrix[0].length-1;
        while (rowBegin <= rowEnd && colBegin <= colEnd){
            for (int i = colBegin; i <= colEnd; i++)
                ans.add(matrix[rowBegin][i]);
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++)
                ans.add(matrix[i][colEnd]);
            colEnd--;

            if (rowBegin <= rowEnd){
                for (int i = colEnd; i >= colBegin; i--)
                    ans.add(matrix[rowEnd][i]);
            }
            rowEnd--;

            if (colBegin <= colEnd){
                for (int i = rowEnd; i >= rowBegin; i--)
                    ans.add(matrix[i][colBegin]);
            }
            colBegin++;
        }
        return ans;
    }
}

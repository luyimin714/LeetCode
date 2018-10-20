package Array;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean fr = false;
        boolean fc = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        if(fr){
            for(int i = 0; i < matrix[0].length; i++)
                matrix[0][i] = 0;
        }

        if(fc){
            for(int j = 0; j < matrix.length; j++)
                matrix[j][0] = 0;
        }
//        List<Integer> row = new ArrayList<>();
//        List<Integer> col = new ArrayList<>();
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix[0].length; j++){
//                if (matrix[i][j] == 0){
//                    row.add(i);
//                    col.add(j);
//                }
//            }
//        }
//        for (int i = 0; i < row.size(); i++){
//            int rowIndex = row.get(i);
//            int colIndex = col.get(i);
//            for (int j = 0; j < matrix[0].length; j++)
//                matrix[rowIndex][j] = 0;
//            for (int j = 0; j < matrix.length; j++)
//                matrix[j][colIndex] = 0;
//        }
    }
}

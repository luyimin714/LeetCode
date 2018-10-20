package Array;

public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length < 1 || matrix[0].length < 1)
            return false;
        int rows = matrix.length, cols = matrix[0].length;
        int row = 0, col = matrix[0].length - 1;
        while(row < rows && col >= 0){
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target)
                col--;
            else
                row++;
        }
        return false;
    }
}

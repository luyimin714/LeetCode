package Array;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {   //矩阵转置 j=i
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
//        int n = matrix.length;
//        int[][] temp = new int[n][n];
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                temp[i][j] = matrix[i][j];
//            }
//        }
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < n; j++){
//                matrix[j][i] = temp[n-i-1][j];
//            }
//        }
    }

}

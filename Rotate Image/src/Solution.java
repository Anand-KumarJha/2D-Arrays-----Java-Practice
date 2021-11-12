import java.util.Arrays;

class Solution {
    public void rotate(int[][] matrix) {
        flipDiagonally(matrix);
        flipHorizontally(matrix);
        System.out.print(Arrays.deepToString(matrix));
    }

    public void flipDiagonally(int[][] matrix){
        int curr;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length - i; j++){
                curr = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - j - 1][matrix.length - i - 1];
                matrix[matrix.length - j - 1][matrix.length - i - 1] = curr;
            }
        }
    }

    public void flipHorizontally(int[][] matrix){
        for(int i = 0; i < matrix.length/2; i++){
            for(int j = 0; j < matrix.length; j++){
                int curr = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i - 1][j];
                matrix[matrix.length - i - 1][j] = curr;
            }
        }
    }
}
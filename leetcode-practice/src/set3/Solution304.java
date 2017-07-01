package set3;

public class Solution304 {

}

class NumMatrix {
    
    private int[][] sumMatrix;
    
    public NumMatrix(int[][] matrix) {
        if (matrix==null || matrix.length==0) {
            return;
        }
        sumMatrix = new int[matrix.length+1][matrix[0].length+1];
        for (int i=matrix.length-1; i>=0; i--) {
            for (int j=matrix[0].length-1; j>=0; j--) {
                sumMatrix[i][j] = sumMatrix[i+1][j]+sumMatrix[i][j+1]-sumMatrix[i+1][j+1]+matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumMatrix[row1][col1]-sumMatrix[row1][col2+1]-sumMatrix[row2+1][col1]+sumMatrix[row2+1][col2+1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */

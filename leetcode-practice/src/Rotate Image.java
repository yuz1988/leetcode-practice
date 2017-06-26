public class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix[0].length;
        for (int i=0; i<len/2; i++) {
            helper(matrix, i);
        }
    }
    
    private void helper(int[][] matrix, int n) {
        int len = matrix[0].length;
        int temp = 0;
        
        for (int i=0; i<(len-1-2*n); i++) {
            temp = matrix[n][n+i];
            
            matrix[n][n+i] = matrix[len-1-n-i][n];
            matrix[len-1-n-i][n] = matrix[len-1-n][len-1-n-i];
            matrix[len-1-n][len-1-n-i] = matrix[n+i][len-1-n];
            matrix[n+i][len-1-n] = temp; 
        }
        
    }
}
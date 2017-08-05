package set0;

public class Solution79 {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0) {
            return false;
        }
        // state table to avoid re-visit
        boolean[][] table = new boolean[board.length][board[0].length];
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (backtrack(board, i, j, word, 0, table)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // table can be avoided by using xor, set board[i][j] ^ 256 which is not equal to board[i][j] and can be recovered by ^ 256 again 
    private boolean backtrack(char[][] board, int i, int j, String word, int start, boolean[][] table) {
        if (start == word.length()) {
            return true;
        }
        if ((i < 0) || (i > board.length-1) || (j < 0) || (j > board[0].length-1)) {
            return false;
        }
        // is (i, j) visited before? 
        if (table[i][j]) {
            return false;
        }       
        if (board[i][j] != word.charAt(start)) {
            return false;
        }
        table[i][j] = true;
        start++;
        boolean res = backtrack(board, i-1, j, word, start, table) || backtrack(board, i+1, j, word, start, table) || 
                    backtrack(board, i, j-1, word, start, table) || backtrack(board, i, j+1, word, start, table);
        table[i][j] = false;
        return res;
    }
}

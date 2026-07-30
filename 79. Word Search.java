class Solution {
    public boolean exist(char[][] board, String word) {
        // Start the search from every possible cell on the board
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (backtrack(board, word, 0, r, c)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board, String word, int index, int row, int col) {
        // base case: check if we matched the entire word
        if (index == word.length()) {
            return true;
        }
        // check boundaries
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }
        // check if current cell matches the character we need
        if (board[row][col] != word.charAt(index)) {
            return false;
        }
        // mark the cell as visited to prevent using it twice in the same path
        char temp = board[row][col];
        board[row][col] = '#'; 
        // explore all 4 directions (Up, Down, Left, Right)
        boolean found =
            backtrack(board, word, index + 1, row + 1, col) || // Down
            backtrack(board, word, index + 1, row - 1, col) || // Up
            backtrack(board, word, index + 1, row, col + 1) || // Right
            backtrack(board, word, index + 1, row, col - 1);   // Left
        // backtrack: restore the original character for other search paths
        board[row][col] = temp;
        return found;
    }
}

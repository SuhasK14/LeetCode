class Solution {
    public void solve(char[][] board) {
        // set variables to save space on multiple calls
        int rows = board.length;
        int cols = board[0].length;
        // call dfs on left and right columns
        for (int row = 0; row < rows; row++) {
            if (board[row][0] == 'O') {
                dfs(board, row, 0);
            }
            if (board[row][cols - 1] == 'O') {
                dfs(board, row, cols - 1);
            }
        }
        // call dfs on top and right rows
        for (int col = 0; col < cols; col++) {
            if (board[0][col] == 'O') {
                dfs(board, 0, col);
            }
            if (board[rows - 1][col] == 'O') {
                dfs(board, rows - 1, col);
            }
        }
        // replace remaining 'O' to 'X'and any temporary 'S' back to 'O'
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                }
                if (board[row][col] == 'S') {
                    board[row][col] = 'O';
                }
            }
        }
    }
    // dfs to mark any land connected to border as 'S'
    // do not need to return board, as char[][] is an object reference in Java
    // when you pass it to a method and modify it, the caller's array is already modified.
    private void dfs(char[][] board, int row, int col) {
        // check bounds
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return;
        }
        // check if land 'X' and not already visited 'S'
        if (board[row][col] == 'S' || board[row][col] == 'X') {
            return;
        }
        // save and call dfs on all edges
        board[row][col] = 'S';
        dfs(board, row - 1, col);
        dfs(board, row + 1, col);
        dfs(board, row, col - 1);
        dfs(board, row, col + 1);
    }
}

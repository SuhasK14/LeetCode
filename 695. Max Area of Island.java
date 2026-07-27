class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        // loop through grid using double for loop
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // check if island present
                if (grid[i][j] == 1) {
                    // call dfs and check count against current max
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }
    // dfs recursive method to get size of island
    private int dfs(int[][] grid, int row, int col) {
        // check outer bounds
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return 0;
        }
        // check if water
        if (grid[row][col] == 0) {
            return 0;
        }
        // set to 0 to mark as visited 
        grid[row][col] = 0;
        // increment the deleted island +1 and call dfs on surrounding islands...
        return 1 + dfs(grid, row + 1, col) + dfs(grid, row - 1, col) + dfs(grid, row, col + 1) + dfs(grid, row, col - 1);
    }
}

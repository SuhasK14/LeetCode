class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // set rows and cols to a variables to save multiple calls
        int rows = heights.length;
        int cols = heights[0].length;
        // to track which cells can reach pacific and atlantic oceans
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        
        // Pacific borders: top row + left column
        for (int c = 0; c < cols; c++) dfs(heights, pacific, 0, c, Integer.MIN_VALUE);
        for (int r = 0; r < rows; r++) dfs(heights, pacific, r, 0, Integer.MIN_VALUE);
        
        // Atlantic borders: bottom row + right column
        for (int c = 0; c < cols; c++) dfs(heights, atlantic, rows - 1, c, Integer.MIN_VALUE);
        for (int r = 0; r < rows; r++) dfs(heights, atlantic, r, cols - 1, Integer.MIN_VALUE);
        
        // Collect cells reachable from both
        List<List<Integer>> result = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    result.add(Arrays.asList(r, c));
                }
            }
        }
        return result;
    }
    public void dfs(int[][] grid, boolean[][] ocean, int row, int col, int height) {
        // check bounds
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return;
        }
        // check if already visited
        // check if water is able to flow to it (current height is less than previous height, as can't flow up)
        if (ocean[row][col] || grid[row][col] < height) {
            return;
        }
        // mark visited
        ocean[row][col] = true;
        // run dfs on all sides
        dfs(grid, ocean, row - 1, col, grid[row][col]);
        dfs(grid, ocean, row + 1, col, grid[row][col]);
        dfs(grid, ocean, row, col - 1, grid[row][col]);
        dfs(grid, ocean, row, col + 1, grid[row][col]);
    }
}

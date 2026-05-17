class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        // loop through each point in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // if new unvisited land is found, increment count
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    // call dfs to mark all adjacent connected lands as visited (find island)
                    dfs(visited, grid, i, j);
                }
            }
        }
        return count;
    }
    private void dfs(boolean[][] visited, char[][] grid, int row, int col) {
        // check bounds of grid
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return;
        }
        // check if value is land and not already visited
        else if (grid[row][col] == '0' || visited[row][col]) {
            return;
        }
        // if 1, mark as visited and check all adjacent areas again (recursion)
        else {
            visited[row][col] = true;
            dfs(visited, grid, row - 1, col);
            dfs(visited, grid, row + 1, col);
            dfs(visited, grid, row, col - 1);
            dfs(visited, grid, row, col + 1);
        }
    }
}

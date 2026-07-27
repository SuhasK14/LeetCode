class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        // loop through grid to count fresh and store rotted oranges
        int fresh = 0;
        Queue<int[]> rotted = new LinkedList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 2) {
                    rotted.add(new int[] {row, col});
                } else if (grid[row][col] == 1) {
                    fresh++;
                }
            }
        }
        // quick return if no fresh oranges present
        if (fresh == 0) {
            return 0;
        }
        // track total minutes
        int minutes = 0;
        // begin loop with starting rotted oranges
        while (!rotted.isEmpty() && fresh > 0) {
            int size = rotted.size();
            minutes++; // increment through each iteration
            for (int i = 0; i < size; i++) {
                int[] current = rotted.poll();
                int r = current[0];
                int c = current[1];
                // do bfs on all adjacent sides: up, down, left, right
                // check if value present is a fresh orange, if so:
                // update to rotting orange, decrement fresh count, and add new rotting orange to rotted queue
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    grid[r - 1][c] = 2;
                    fresh--;
                    rotted.add(new int[]{r - 1, c});
                }
                if (r + 1 < rows && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    fresh--;
                    rotted.add(new int[]{r + 1, c});
                }
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    fresh--;
                    rotted.add(new int[]{r, c - 1});
                }
                if (c + 1 < cols && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    fresh--;
                    rotted.add(new int[]{r, c + 1});
                }
            }
        }
        // if no fresh remaining, return minutes. Otherwise, return -1
        return fresh == 0 ? minutes : -1;
    }
}

class Solution
{
    public int equalPairs(int[][] grid)
    {
        int count = 0;
        int n = grid.length;
        // Iterate through each row
        for (int i = 0; i < n; i++)
        {
            // Iterate through each column
            for (int j = 0; j < n; j++)
            {
                // Check if the row and column are equal
                if (equal(grid, i, j))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean equal(int[][] grid, int row, int col)
    {
        for (int k = 0; k < grid.length; k++)
        {
            if (grid[row][k] != grid[k][col])
            {
                return false;
            }
        }
        return true;
    }
}

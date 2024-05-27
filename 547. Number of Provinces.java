class Solution
{
    public int findCircleNum(int[][] isConnected)
    {
        // total number of provinces
        int provinces = 0;
        // boolean array to keep track of visited cities
        boolean[] visited = new boolean[isConnected.length];
        // traverse isConnected
        for (int i = 0; i < isConnected.length; i++)
        {
            // check if the city has been visited or not
            if (!visited[i])
            {
                // if not visited check all cities that can be visited indirectly or directly from there
                dfs(isConnected, visited, i);
                // add 1 to provinces
                provinces++;
            }
        }
        return provinces;
    }
    // checks for all connections from given city at i
    public void dfs(int[][] isConnected, boolean[] visited, int i)
    {
        // check that the city has been visited
        visited[i] = true;
        // traverse the array of cities city i can visit
        for (int j = 0; j < isConnected[i].length; j++)
        {
            // check if there is a connection and the city has not been visited before
            if (isConnected[i][j] == 1 && !visited[j])
            {
                // call dfs on the city j
                dfs(isConnected, visited, j);
            }
        }
    }
}

class Solution
{
    public int minReorder(int n, int[][] connections)
    {
        // Create an adjacency list for the graph
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; ++i)
        {
            graph[i] = new ArrayList<>();
        }

        // Build the graph
        for (int[] connection : connections)
        {
            int u = connection[0];
            int v = connection[1];
            graph[u].add(v);    // Add edge u -> v
            graph[v].add(-u);   // Add edge v -> u (represented as -u)
        }

        // Start DFS from city 0
        return dfs(graph, 0, -1);
    }

    private int dfs(List<Integer>[] graph, int u, int parent)
    {
        int change = 0;

        for (int v : graph[u])
        {
            if (Math.abs(v) == parent)
            {
                continue;   // Skip the parent city
            }
            if (v > 0)
            {
                change++;   // Increment change if the edge needs reorientation
            }
            // Recursively visit the next city
            change += dfs(graph, Math.abs(v), u);
        }

        return change;
    }
}

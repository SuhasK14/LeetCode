class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // save first 2 just like fibonacci; cost.length guaranteed to be >= 2
        int a = cost[0];
        int b = cost[1];
        for (int i = 2; i < cost.length; i++) {
            int temp = b;
            // min cost to reach step i = its cost + cheaper of the two previous steps
            b = cost[i] + Math.min(a, b);
            // shift: old b becomes new a for next iteration
            a = temp; 
        }
        // can reach the top from either of the last two steps
        return Math.min(a, b);
    }
}

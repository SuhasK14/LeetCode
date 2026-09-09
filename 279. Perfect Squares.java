class Solution {
    public int numSquares(int n) {
        // array to get already ran values to avoid time exceeded exception
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return helper(n, memo);
    }
    private int helper(int remain, int[] memo) {
        // base case: nothing remaining, return 0
        if (remain == 0) {
            return 0;
        }
        // return memoized value
        if (memo[remain] != -1) {
            return memo[remain];
        }
        // get min value at remain
        int min = Integer.MAX_VALUE;
        for (int i = 1; i*i <= remain; i++) {
            min = Math.min(min, 1 + helper(remain - i*i, memo));
        }
        memo[remain] = min; // store in memo for future use
        return min; // return
    }
}

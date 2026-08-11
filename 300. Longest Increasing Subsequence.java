class Solution {
    public int lengthOfLIS(int[] nums) {
        int max = 0;
        // dynamic programming problem: store longest increasing subsequence up to that index in dp array
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // default length is 1 for itself
            dp[i] = 1;
            // loop through all prior nums to see if current i is greater, if so, then append 1 to dp at prior index j
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]); // only store if greater than current dp[i]
                }
            }
            max = Math.max(max, dp[i]); // check if current dp[i] is max increasing subsequence
        }
        return max;
    }
}

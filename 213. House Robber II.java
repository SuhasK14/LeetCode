class Solution {
    public int rob(int[] nums) {
        // check base cases
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else if (nums.length == 3) {
            return Math.max(nums[0], Math.max(nums[1], nums[2]));
        }
        // (excluding last element)
        // DP array: set first 2 elements, prior base cases ensure valid inputs
        int[] dp = new int[2];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        // cut off last element (nums.length - 1)
        for (int i = 2; i < nums.length - 1; i++) {
            // calculate dp by getting max of prior index (1) vs 2 prior index (0) + current nums[i]
            int temp = Math.max(dp[1], dp[0] + nums[i]);
            // move forward: 0 becomes 1, and 1 becomes new max
            dp[0] = dp[1];
            dp[1] = temp;
        }
        int first = dp[1]; // store max
        // (excluding first element)
        // DP array: set first 2 elements, prior base cases ensure valid inputs
        dp = new int[2];
        dp[0] = nums[1];
        dp[1] = Math.max(nums[1], nums[2]);
        // cut off first element, start at i = 3
        for (int i = 3; i < nums.length; i++) {
            // calculate dp by getting max of prior index (1) vs 2 prior index (0) + current nums[i]
            int temp = Math.max(dp[1], dp[0] + nums[i]);
            // move forward: 0 becomes 1, and 1 becomes new max
            dp[0] = dp[1];
            dp[1] = temp;
        }
        return Math.max(first, dp[1]);
    }
}

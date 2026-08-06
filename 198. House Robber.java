class Solution {
    public int rob(int[] nums) {
        // check base cases
        if (nums.length == 1) {
            return nums[0];
        }
        // do array that contains max value up to that index (no looking ahead)
        int[] dp = new int[nums.length];
        // set first 2 elements
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        // loop through nums
        for (int i = 2; i < nums.length; i++) {
            // calculate dp by getting max of prior index vs current index + 2 indexes back
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        // last index contains maximum amount
        return dp[nums.length - 1];
    }
}

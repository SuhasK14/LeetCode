class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        // Like Fibonacci but little different DP problem
        int a = nums[0];
        int b = nums[1];
        for (int i = 2; i < nums.length; i++) {
            int temp = b;
            // either skip this house (keep b) or rob it (nums[i](current) + 2 back(stored in a))
            b = Math.max(b, (a + nums[i]));
            // a keeps current value or switches to b as we go to next index forward
            a = Math.max(a, temp);
        }
        // b holds the max profit between a + cost and b, so return
        return b;
    }
}

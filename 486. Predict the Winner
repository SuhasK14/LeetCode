class Solution {
    public boolean predictTheWinner(int[] nums) {
        // if player 1 score is equal to or greater than return true
        return maxDiff(nums, 0, nums.length - 1) >= 0;
    }
    // helper function to find maximum difference between the current player (could be player 1 or 2 depending on turn)
    private int maxDiff(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        // choose left or right and calculate maxDiff recursively until above if condition is met
        int leftChoice = nums[left] - maxDiff(nums, left + 1, right);
        int rightChoice = nums[right] - maxDiff(nums, left, right - 1);
        // return best route : left or right
        return Math.max(leftChoice, rightChoice);
    }
}

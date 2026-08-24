class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums); // sort nums
        // edge case: if all negative, then take highest 3
        if (nums[len - 1] < 0) {
            return nums[len - 1] * nums[len - 2] * nums[len - 3];
        }
        // calculate bottom 2 elements and top 2 elements, not including highest
        int bot = nums[0] * nums[1];
        int top = nums[len - 3] * nums[len - 2];
        // return max of bottom and top, multiplied by highest element
        return Math.max(bot, top) * nums[len - 1];
    }
}

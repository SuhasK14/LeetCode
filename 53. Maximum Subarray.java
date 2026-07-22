class Solution {
    public int maxSubArray(int[] nums) {
        // guaranteed 1 element in provided nums array, as you must return subarray with atleast 1 element
        int max = nums[0];
        int current = nums[0];
        // loop through starting at second index
        for (int i = 1; i < nums.length; i++) {
            // set current to maximum of itself or itself with current element added to it,
            // continue current subarray with current element or reset with value of current element
            current = Math.max(current + nums[i], nums[i]);
            // set max to current subarray or keep as is
            max = Math.max(current, max);
        }
        return max;
    }
}

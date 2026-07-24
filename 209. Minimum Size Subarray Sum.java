class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // set min to max value so math.min satisifies no matter what
        int min = Integer.MAX_VALUE;
        int sum = 0;
        // sliding window
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            // keep moving window right
            sum += nums[right];
            // once target is reached, shrink window from left
            while (sum >= target) {
                // check if new min reached
                min = Math.min(min, right + 1 - left);
                // shrink
                sum -= nums[left];
                left++;
            }
        }
        // if no min, the min = value set initially while is integer.max_value, replace with 0 as problem statement writes
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}

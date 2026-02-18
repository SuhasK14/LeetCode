class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (nums.length == 3) {
            return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        }
        // Run for all houses 1 to N-1
        int a = nums[0];
        int b = nums[1];
        for (int i = 2; i < nums.length - 1; i++) {
            int temp = b;
            // either skip this house (keep b) or rob it (nums[i](current) + 2 back(stored in a))
            b = Math.max(b, (a + nums[i]));
            // a keeps current value or switches to b as we go to next index forward
            a = Math.max(a, temp);
        }

        // Run for all houses 2 to N
        int c = nums[1];
        int d = nums[2];
        for (int i = 3; i < nums.length; i++) {
            int temp = d;
            // either skip this house (keep d) or rob it (nums[i](current) + 2 back(stored in c))
            d = Math.max(d, (c + nums[i]));
            // c keeps current value or switches to d as we go to next index forward
            c = Math.max(c, temp);
        }
        // b and d holds the max profit for both approaches, so return max
        return Math.max(b,d);
    }
}

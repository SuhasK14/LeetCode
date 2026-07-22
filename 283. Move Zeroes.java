class Solution {
    public void moveZeroes(int[] nums) {
        // current index of array without zeroes
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            // if nums value at index is not 0, then set value to curr index of nums
            // curr and i both increment on each loop, but curr does not increment if nums[i] = 0
            // thus, this is where the discrepancy occurs and logic sets in to skip the zeroes
            if (nums[i] != 0) {
                nums[curr] = nums[i];
                curr++;
            }
        }
        // if the current index is less than the array length, this means there were zeroes, as curr was not incremented
        while (curr < nums.length) {
            // set curr index of nums to 0 and increment until loop validates
            nums[curr] = 0;
            curr++;
        }
    }
}

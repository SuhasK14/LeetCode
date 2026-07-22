class Solution {
    public int[] sortedSquares(int[] nums) {
        // two pointers approach
        int left = 0;
        int right = nums.length - 1;
        // create new results array that is be returned with sorted squares of nums
        int[] results = new int[nums.length];
        int pos = nums.length - 1;
        // while left is not greater than right (less than or equal to right)
        while (left <= right) {
            // condition to check which side absolute value is greater
            // set square of greater value to current pos of new results array, starting from the end
            if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
                results[pos] = Math.abs(nums[right]) * Math.abs(nums[right]);
                // right greater so decrement
                right--;
            } else {
                results[pos] = Math.abs(nums[left]) * Math.abs(nums[left]);
                // left greater so increment
                left++;
            }
            // decrement as we are starting from the end
            pos--;
        }
        return results;
    }
}

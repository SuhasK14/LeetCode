class Solution {
    public int searchInsert(int[] nums, int target) {
        // default set low and high
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            // recalculate mid every iteration to be mid of low and high
            int mid = (low + high) / 2;
            // check if target is =,<,> than mid
            if (target == nums[mid]) {
                // if equal, then return index
                return mid;
            } else if (target < nums[mid]) {
                // since target is lower than mid, set high to mid
                // do -1 since mid has already been checked
                high = mid - 1;
            } else {
                // since target is higher than mid, set low to mid
                // do +1 since mid has already been checked
                low = mid + 1;
            }
        }
        // return low, as when the loop ends, low is the first index where nums[mid] is not smaller than target.
        return low;
    }
}

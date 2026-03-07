class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            // if value at i index does not equal val, continue as is
            if (nums[i] != val) {
                nums[k] = nums[i];
                // increment k along with i, so no values get skipped that are not equal to val
                k++;
            }
            // if condition is not met, meaning value at index = val, then k is not incrememted
            // current value at index i will be skipped,as the next value of i that is not equal to val will overwrite it 
        }
        return k;
    }
}

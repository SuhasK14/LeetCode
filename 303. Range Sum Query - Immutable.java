class NumArray
{
    // create global prefix sum array
    int psum[];
    // given NumArray object
    public NumArray(int[] nums)
    {
        // set prefix sum array to given nums array length + 1
        psum = new int[nums.length + 1];
        // set first value of prefix sum to 0,
        // as all the values before the first element in nums do not exist so 0
        psum[0] = 0;
        // loop through nums array and add values to psum, starting at 1 index since 0 is 0
        for (int i = 1; i < nums.length + 1; i++)
        {
            // set current value of p to previous sum element + previous element in nums
            psum[i] = psum[i - 1] + nums[i - 1];
        }
    }
    
    // find sum of elements in nums given left and right range inclusive
    public int sumRange(int left, int right)
    {
        // since it is left and right of nums inclusive,
        // need to add 1 to right to get all elements sum before it
        return psum[right + 1] - psum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

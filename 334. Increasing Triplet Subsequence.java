class Solution
{
    public boolean increasingTriplet(int[] nums)
    {
        // base case
        if (nums.length <= 2)
        {
            return false;
        }
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        for (int in = 0; in < nums.length; in++)
        {
            // i case
            if (nums[in] <= i)
            {
                i = nums[in];
            }
            // j case
            else if (nums[in] <= j)
            {
                j = nums[in];
            }
            // k case; no need to explicitly state as if there is K value, return true
            else
            {
                return true;
            }
        }
        return false;
    }
}

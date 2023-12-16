class Solution
{
    public int longestSubarray(int[] nums)
    {
        // base case
        if (nums.length == 1)
        {
            return 0;
        }
        int max = 0;
        int left = 0;
        int k = 1;
        for (int right = 0; right < nums.length; right++)
        {
            if (nums[right] == 0)
            {
                k--;
            }
            while (k < 0)
            {
                if (nums[left] == 0)
                {
                    k++;
                }
                left++;
            }
            max = Math.max(max, (right - left));
        }
        return max;
    }
}

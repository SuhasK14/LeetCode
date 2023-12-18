class Solution
{
    public int maxOperations(int[] nums, int k)
    {
        // sort array from least to greatest
        Arrays.sort(nums);

        int max = 0;

        // create left and right index for nums array
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right)
        {
            if(nums[left] + nums[right] > k)
            {
                right--;
            }
            else if(nums[left] + nums[right] < k)
            {
                left++;
            }
            else
            {
                max++;
                left++;
                right--;
            }
        }
        return max;
    }
}

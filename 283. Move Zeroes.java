class Solution
{
    public void moveZeroes(int[] nums)
    {
        int counter = 0;
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                nums[counter] = nums[i];
                counter++;
            }
            else
            {
                zeroes++;
            }
        }
        for (int i = 1; i <= zeroes; i++)
        {
            nums[nums.length - i] = 0;
        }
    }
}

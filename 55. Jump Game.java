class Solution 
{
    public boolean canJump(int[] nums)
    {
        // set goal to last index of nums
        int goal = nums[nums.length - 1];
        // loop through nums backwards
        for (int i = nums.length - 1; i >= 0; i--)
        {
            // check to see if current index plus the amount it can jump will go past the last index or goal
            if (i + nums[i] >= goal)
            {
                // if so, change the goal to be the index
                // this makes it so the goal is further moved closer to the beginning
                goal = i;
            }
        }
        // if the goal is moved to the beginning which is 0, return true or false
        return goal == 0;
    }
}

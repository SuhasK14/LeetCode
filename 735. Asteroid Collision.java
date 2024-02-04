class Solution
{
    public int[] asteroidCollision(int[] asteroids)
    {
        // create stack
        Stack<Integer> stack = new Stack<>();
        // loop through asteroids and push to stack following collision rules
        for (int i = 0; i < asteroids.length; i++)
        {
            while (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0)
            {
                if (stack.peek() + asteroids[i] > 0)
                {
                    // asteroids[i] loses collision; asteroids[i] gets destroyed
                    asteroids[i] = 0;
                }
                else if (stack.peek() + asteroids[i] < 0)
                {
                    // asteroids[i] wins collision; asteroid at top of stack gets destroyed
                    stack.pop();
                }
                else
                {
                    // asteroids[i] ties collision; both get destroyed
                    stack.pop();
                    asteroids[i] = 0;
                }
            }
            // after collisions, push to stack
            if (asteroids[i] != 0)
            {
                stack.push(asteroids[i]);
            }
        }
        // convert stack to int[] and return it
        int[] ans = new int[stack.size()];
        int length = stack.size() - 1;
        for (int i = length; i >= 0; i--)
        {
            ans[i] = stack.pop();
        }
        return ans;
    }
}

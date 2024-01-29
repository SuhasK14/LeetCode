class Solution
{
    public String removeStars(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != '*')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                stack.pop();
            }
        }
        String output = "";
        int length = stack.size();
        for (int i = 0; i < length; i++)
        {
            output = stack.pop() + output;
        }
        return output;
    }
}

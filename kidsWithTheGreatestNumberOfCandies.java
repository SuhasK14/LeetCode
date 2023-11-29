class Solution
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> results = new ArrayList<Boolean>();
        int max = 0;
        for (int i = 0; i < candies.length; i++)
        {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++)
        {
            if ((candies[i] + extraCandies) >= max)
            {
                results.add(true);
            }
            else
            {
                results.add(false);
            }
        }
        return results;
    }
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // flowers planted
        int flowers = 0;
        // loop through flowerbed
        for (int i = 0; i < flowerbed.length; i++)
        {
            // base case for length 1
            if (i == 0 && flowerbed.length == 1)
            {
                if (flowerbed[i] == 0)
                {
                    flowers++;
                }
            }
            // case for first element
            else if (i == 0)
            {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0)
                {
                    flowers++;
                    flowerbed[i]++;
                }
            }
            // case for last element
            else if (i == flowerbed.length - 1)
            {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0)
                {
                    flowers++;
                }
            }
            // case for middle elements
            else
            {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0)
                {
                    flowers++;
                    flowerbed[i]++;
                }
            }
        }
        // check if flowers is greater than n and return accordingly
        if (flowers >= n)
        {
            return true;
        }
        return false;
    }
}

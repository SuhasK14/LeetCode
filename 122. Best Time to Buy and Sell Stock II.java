class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        // two pointer approach starting at first 2 indices
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            // current price is >= future price (move currrent to future)
            if (prices[left] >= prices[right]) {
                left++;
                right++;
            }
            // current price is < future price (take profit and move forward)
            else {
                profit += prices[right] - prices[left];
                left++;
                right++;
            }
        }

        return profit;
    }
}

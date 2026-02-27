class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            // if youre selling at a loss, set the minimum to current price
            if (price < min) {
                min = price;
            }
            // if you can get at a profit, check if it is the max profit. If so, set it as the new max
            else if (price > max) {
                max = Math.max(max, price - min);
            }
        }
        // the prices are linear time, so once loop is complete one way, return max
        return max;
    }
}

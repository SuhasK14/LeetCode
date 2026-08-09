class Solution {
    public int coinChange(int[] coins, int amount) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return minCoins(coins, amount, map);
    }
    public int minCoins(int[] coins, int remaining, HashMap<Integer, Integer> map) {
        // check if already got minCoins on remaining amount
        if (map.containsKey(remaining)) {
            return map.get(remaining);
        }
        // check if coin completes remaining amount
        if (remaining == 0) {
            return 0;
        }
        // find next coin to use and call minCoins
        int best = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (coin <= remaining) {
                int result = minCoins(coins, remaining - coin, map);
                if (result == -1) {
                    continue;
                }
                best = Math.min(best, result + 1);
            }
        }
        // get best and store in hashmap for memoization (-1 if not valid)
        if (best == Integer.MAX_VALUE) {
            best = -1;
        }
        map.put(remaining, best);
        return best;
    }
}

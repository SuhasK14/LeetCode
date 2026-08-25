class Solution {
    public int numDecodings(String s) {
        // create array where index is start and value is total ways
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1); // -1 as default value; to check if calculated
        return ways(s, 0, memo);
    }
    private int ways(String s, int start, int[] memo) {
        // base case, string decoded successfully
        if (start == s.length()) {
            return 1;
        }
        // cache check, right after the base case
        if (memo[start] != -1) {
            return memo[start];
        }
        // calculate total
        int total = 0;
        if (s.charAt(start) != '0') {
            // recursive call on 1 digit if not zero
            total += ways(s, start + 1, memo);
            if (start + 1 < s.length() && Integer.parseInt(s.substring(start, start + 2)) < 27) {
                // recursive call on 2 digits if below 27
                total += ways(s, start + 2, memo);
            }
        }
        memo[start] = total; // cache total in array at index start
        return total; // return total
    }
}

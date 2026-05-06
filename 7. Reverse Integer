class Solution {
    public int reverse(int x) {
        // check negative or positive
        boolean neg = false;
        if (x < 0) {
            neg = true;
            x *= -1;
        }
        // reverse integer and store in long
        long reverse = 0;
        while (x > 0) {
            int mod = x % 10;
            x /= 10;
            reverse = reverse * 10 + mod;
            // check if reverse is outside the 32 bit integer range
            if (reverse > Integer.MAX_VALUE) {
                return 0;
            }
        }
        // add potential negative back
        if (neg) {
            reverse *= -1;
        }
        // return int type casted long
        return (int) reverse;
    }
}

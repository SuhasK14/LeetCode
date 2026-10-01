class Solution {
    public boolean isHappy(int n) {
        // hash set to track which values have been checked
        HashSet<Integer> set = new HashSet<>();
        // loop till repeat value
        while(!set.contains(n)) {
            set.add(n); // add value to set
            // get sum
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            // return true if sum equals 1
            if (sum == 1) {
                return true;
            }
            n = sum; // continue looping
        }
        return false;
    }
}

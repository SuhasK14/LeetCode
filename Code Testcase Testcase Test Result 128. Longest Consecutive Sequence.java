class Solution {
    public int longestConsecutive(int[] nums) {
        // add all ints in nums to a set for better retrieval
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // find max
        int max = 0;
        for (int num : set) {
            // if no number before, then num is the beginning of a sequence
            if (!set.contains(num - 1)) {
                // get and count length of subsequence 
                int current = num;
                int length = 1; // start at 1
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                // check if max subsequence
                max = Math.max(max, length);
            }
        }
        return max;
    }
}

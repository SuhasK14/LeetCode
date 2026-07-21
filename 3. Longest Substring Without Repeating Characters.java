class Solution {
    public int lengthOfLongestSubstring(String s) {
        // edge cases
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        // store characters and index in map to avoid duplicates and reset
        HashMap<Character, Integer> map = new HashMap<>();
        // vars to keep track of max size, temp size, and last index reset from
        int max = 0;
        int temp = 0;
        int start = 0;
        // loop through character array using s.toCharArray. 
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // increment count if letter has not been used or letter was encountered before reset
            if (!map.containsKey(chars[i]) || start > map.get(chars[i])) {
                temp++;
                max = Math.max(max, temp);
            } else {
                // letter has been used: update start and reset temp 
                start = map.get(chars[i]);
                temp = i - start;
            }
            // add letter and index to hashmap 
            map.put(chars[i], i);
        }
        return max;
    }
}

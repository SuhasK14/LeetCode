class Solution {
    public String longestCommonPrefix(String[] strs) {
        // default prefix is first string in array, array > 0 guaranteed
        String prefix = strs[0];
        // loop through array starting at 1 index, since first is prefix
        for (int i = 1; i < strs.length; i++) {
            // nested loop that checks current string against prefix
            for (int j = 0; j < prefix.length(); j++) {
                // if prefix is longer than string or there is a char mismatch, break loop and set prefix
                if (j >= strs[i].length() || strs[i].charAt(j) != prefix.charAt(j)) {
                    // prefix is set to whatever the index the loop got to, which is j (exclusive)
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
        }
        return prefix;
    }
}

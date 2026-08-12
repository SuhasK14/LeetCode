class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // convert list to set for easy lookup
        Set<String> set = new HashSet<>();
        for (String word : wordDict) {
            set.add(word);
        }
        // use string array to store traversed values (prevents time limit exceeded exception)
        Boolean[] visited = new Boolean[s.length()];
        return canBreak(set, s, 0, visited);
    }
    private boolean canBreak(Set<String> set, String s, int start, Boolean[] visited) {
        // reached end of string
        if (start == s.length()) {
            return true;
        }
        // check if already traversed and return boolean stored at index start
        if (visited[start] != null) {
            return visited[start];
        }
        /* loop through s until substring is found in word set, then call canBreak using new start
        (continue appending to current substring in case of further longer matches...) */
        for (int i = start; i < s.length(); i++) {
            if (set.contains(s.substring(start, i + 1))) {
                if (canBreak(set, s, i + 1, visited)) {
                    // set true in boolean array and return true
                    visited[start] = true;
                    return true;
                }
            }
        }
        // set false in boolean array and return false
        visited[start] = false;
        return false;
    }
}

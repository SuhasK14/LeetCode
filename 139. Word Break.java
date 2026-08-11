class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // convert list to set for easy lookup
        Set<String> set = new HashSet<>();
        for (String word : wordDict) {
            set.add(word);
        }
        // use hashmap to get already traversed values, prevent time limit exceeded exception
        HashMap<Integer, Boolean> map = new HashMap<>();
        return canBreak(set, s, 0, map);
    }
    private boolean canBreak(Set<String> set, String s, int start, HashMap<Integer, Boolean> map) {
        // reached end of string
        if (start == s.length()) {
            return true;
        }
        // check if already traversed and return boolean stored in map
        if (map.containsKey(start)) {
            return map.get(start);
        }
        // use temp and loop through s until word is found in set, from there, call canBreak and continue appending to current
        String temp = "";
        for (int i = start; i < s.length(); i++) {
            temp += s.charAt(i);
            if (set.contains(temp)) {
                if (canBreak(set, s, i + 1, map)) {
                    // store in map and return true
                    map.put(i, true);
                    return true;
                }
            }
        }
        // store in map and return false
        map.put(start, false);
        return false;
    }
}

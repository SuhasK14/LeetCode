class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // store list of words in a set for easy lookup
        HashSet<String> set = new HashSet<>();
        for (String s : wordList) {
            set.add(s);
        }
        // edge case
        if (!set.contains(endWord)) {
            return 0;
        }
        // track how many levels needed
        int level = 0;
        // Use BFS, initialize queue and begin loop
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            // loop through each word in queue
            for (int i = 0; i < size; i++) {
                String str = queue.poll();
                // check if matches end word and return level
                if (str.equals(endWord)) {
                    return level;
                }
                // go through every letter in word
                char[] strChars = str.toCharArray();
                for (int j = 0; j < strChars.length; j++) {
                    char temp = strChars[j];
                    // try a different letter for current letter in word (go through alphabet)
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == temp) continue; // skip present letter
                        strChars[j] = c;
                        String next = String.valueOf(strChars);
                        // check if word is in set, if so add to queue as possible match
                        if (set.contains(next)) {
                            queue.add(next);
                            set.remove(next); // avoid infinite loops: words turning back into one another
                        }
                    }
                    strChars[j] = temp; // reset
                }
            }
        }
        return 0;
    }
}

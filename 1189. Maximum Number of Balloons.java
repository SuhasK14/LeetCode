class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] chars = new int[26];
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }
        // while loop through for balloon, removing characters as they pass
        String balloon = "balloon";
        int count = 0;
        while (true) {
            for (char c : balloon.toCharArray()) {
                if (chars[c - 'a'] <= 0) { // break condition
                    return count;
                }
                chars[c - 'a']--; // decrement from given text chars
            }
            count++; // balloon loop completes, increment count
        }

        /*
        // Optimal solution using arithmetic:
        // b-a-l-l-o-o-n: l and o appear twice, b/a/n appear once
        int min = chars['b' - 'a'];
        min = Math.min(min, chars['a' - 'a']);
        min = Math.min(min, chars['l' - 'a'] / 2);
        min = Math.min(min, chars['o' - 'a'] / 2);
        min = Math.min(min, chars['n' - 'a']);
        return min;
        */
    }
}

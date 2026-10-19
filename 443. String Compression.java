class Solution {
    public int compress(char[] chars) {
        // two pointers approach: tracking where to read and where to right
        int read = 0;
        int write = 0;
        // loop through chars while read < length
        while (read < chars.length) {
            // get current letter / fresh count
            char c = chars[read];
            int count = 0;
            // count the number of occurences of letter
            while (read < chars.length && chars[read] == c) {
                read++;
                count++;
            }
            // write letter to chars
            chars[write++] = c;
            // write count if > 1
            if (count > 1) {
                // convert to string and then write count to handle cases > 9
                String countStr = String.valueOf(count);
                for (int i = 0; i < countStr.length(); i++) {
                    chars[write++] = countStr.charAt(i);
                }
            }
        }
        return write;
    }
}

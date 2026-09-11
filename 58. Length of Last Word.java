class Solution {
    public int lengthOfLastWord(String s) {
        // trim given s sentence to remove leading and trailing white spaces
        // then, split sentence into words by using " " space as break point
        String[] words = s.trim().split(" ");
        // return length of the last element stored in words (last word)
        return words[words.length - 1].length();

        /*
        // Optimal Space Solution:
        int i = s.length() - 1;
        // skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // count characters until we hit a space or run out
        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
        */
    }
}

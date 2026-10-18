class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // Brute Force: loop through each available option in string for substring
        // go until halfway point, as can't repeat after
        for (int i = 1; i <= s.length() / 2; i++) {
            // use stringbuilder over string, as we will be modifying value multiple times
            StringBuilder temp = new StringBuilder(s.substring(0, i));
            // check substring if it can be repeated to equal string s, if so, return true
            while (temp.length() < s.length()) {
                temp.append(s.substring(0, i));
                if (temp.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}

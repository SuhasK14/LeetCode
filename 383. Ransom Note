class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // if note is longer than magazine, return false as not possible
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        // use a primitive int array instead of HashMap, as only lowercase letters are being used (26 indexes)
        int[] counts = new int[26];
        // add each value in magazine to array
        for (char c : magazine.toCharArray()) {
            // lowercase letters 'a' through 'z' correspond to 97-122 on ASCII/Unicode tables
            // this is done through subrtracting the current value c which is 97-122 by the value of 'a' (97)
            // leading to the followign structure: 'a' -> index 0, 'b' -> index 1, etc.
            counts[c - 'a']++;
        }
        // subtract each value in ransomNote from magazine counts
        for (char c : ransomNote.toCharArray()) {
            // return false if we ran out
            if (counts[c - 'a'] <= 0) {
                return false;
            }
            counts[c - 'a']--;
        }
        return true;
    }
}

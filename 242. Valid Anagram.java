class Solution {
    public boolean isAnagram(String s, String t) {
        // convert string to char array and then sort, cant do it in same lines as you get potential void error
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        // check edge case in case they are different lengths
        if (c1.length != c2.length) {
            return false;
        }
        // loop through 1 by 1 and check that the 2 sorted strings match each other
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }
}

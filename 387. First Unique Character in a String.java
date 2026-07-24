/*
For best runtime, use same approach subbing out the HashMap for an Array. String s is only lowercase letters (26 options)
The array will be 26 long with each index representing a letter. The value at the index will be the frequency.
Arrays have better retrieval times, etc... than HashMaps which leads to the better runtime even though algo/logic is same
-- Look at RansomNote problem for example of this approach --
*/
class Solution {
    public int firstUniqChar(String s) {
        // map letters in String s to be a HashMap based on character as key and frequency as value
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // loop through each character in s and return index of first one with mapped value of '1'
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        // return -1 if does not exist
        return -1;
    }
}

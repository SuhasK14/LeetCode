class Solution {
    public boolean isIsomorphic(String s, String t) {
        // hashmap to track s and t mapped values to eachother
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        // loop through string and check
        for (int i = 0; i < s.length(); i++) {
            // current chars for s and t strings
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            // check if current mappings are allowed for both maps, otherwise return false
            if (mapST.containsKey(sChar) && mapST.get(sChar) != tChar) {
                return false;
            }
            if (mapTS.containsKey(tChar) && mapTS.get(tChar) != sChar) {
                return false;
            }
            // if valid, then map values
            mapST.put(sChar, tChar);
            mapTS.put(tChar, sChar);
        }
        // if clears, then return true
        return true;
    }
}

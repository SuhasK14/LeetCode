class Solution {
    public boolean wordPattern(String pattern, String s) {
        // maps to check both ways
        HashMap<String, String> mapLW = new HashMap<>();
        HashMap<String, String> mapWL = new HashMap<>();
        String[] words = s.split(" ");
        // check to make sure number of words = number of letter, otherwise return false
        if (pattern.length() != words.length) {
            return false;
        }
        // loop
        for (int i = 0; i < words.length; i++) {
            // conditionals: check if letter maps to the appropriate word and if word maps to the appropriate letter
            if (mapLW.containsKey(pattern.substring(i, i+1)) && !mapLW.get(pattern.substring(i, i+1)).equals(words[i])) {
                return false;
            }
            if (mapWL.containsKey(words[i]) && !mapWL.get(words[i]).equals(pattern.substring(i, i+1))) {
                return false;
            }
            // map both ways: LW, WL
            mapLW.put(pattern.substring(i, i+1), words[i]);
            mapWL.put(words[i], pattern.substring(i, i+1));
        }
        return true;
    }
}

class Solution {
    public boolean wordPattern(String pattern, String s) {
        // maps to check both ways
        HashMap<Character, String> mapLW = new HashMap<>();
        HashMap<String, Character> mapWL = new HashMap<>();
        String[] words = s.split(" ");
        // check to make sure number of words = number of letter, otherwise return false
        if (pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            char letter = pattern.charAt(i);
            String word = words[i];
            // conditionals: check if letter maps to the appropriate word and if word maps to the appropriate letter
            if (mapLW.containsKey(letter) && !mapLW.get(letter).equals(word)) {
                return false;
            }
            if (mapWL.containsKey(word) && !mapWL.get(word).equals(letter)) {
                return false;
            }
            // map both ways: LW, WL
            mapLW.put(letter, word);
            mapWL.put(word, letter);
        }
        return true;
    }
}

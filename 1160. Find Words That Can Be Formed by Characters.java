class Solution {
    public int countCharacters(String[] words, String chars) {
        // store chars in an array using ascii indexing - 'a', since only lowercase letters
        int[] charArr = new int[26];
        for (char c : chars.toCharArray()) {
            charArr[c - 'a']++;
        }
        // loop through words, adding valid word's length to total 
        int total = 0;
        for (String word : words) {
            int[] temp = charArr.clone(); // have to use .clone() since regaular = will match to object reference
            int len = 0;
            // check current word characters freq against chars
            for (char c : word.toCharArray()) {
                // break condition
                if (temp[c - 'a'] <= 0) {
                    len = 0;
                    break;
                }
                // continue if valid
                len++;
                temp[c - 'a']--;
            }
            total += len; // add valid length total
        }
        return total; // return total
    }
}

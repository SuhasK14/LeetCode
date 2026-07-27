class Solution {
    public List<String> letterCombinations(String digits) {
        // hashmap<Integer, String> map to store all digits to letters
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        // list of combos to be returned after calling getCombos
        List<String> combos = new ArrayList<>();   
        getCombos(map, digits, combos, "", 0);
        return combos;
    }
    private void getCombos(HashMap<Character, String> map, String digits, List<String> combos, String cur, int index) {
        // loop through each letter returned by the digit at that index
        for (char letter : map.get(digits.charAt(index)).toCharArray()) {
            // check if we reached the last digit
            if (index == digits.length() - 1) {
                // add full combination to combo
                combos.add(cur + letter);
            } else {
                // go deeper: add letter and recursively call
                getCombos(map, digits, combos, cur + letter, index + 1);
            }
        }
    }
}

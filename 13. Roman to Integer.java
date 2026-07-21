class Solution {
    public int romanToInt(String s) {
        // Create hashmap to map each roman character with its integer value
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        // loop through string to find total
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            // get current value from hashmap
            int curr = map.get(s.charAt(i));
            // check if next value exixts before calling it (avoid null pointer exception)
            if (i + 1 < s.length() && curr < map.get(s.charAt(i + 1))) {
                // if next value is greater, then subtract current value
                total -= curr;
            } else {
                total += curr;
            }
        }
        // return total after loop completes
        return total;
    }
}

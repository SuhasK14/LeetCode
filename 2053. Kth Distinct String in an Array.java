class Solution {
    public String kthDistinct(String[] arr, int k) {
        // hashmap that holds string as key and freq as value
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        // loop through arr again, and check for freq values of 1
        for (String s : arr) {
            if (map.get(s) == 1) {
                // check k value, otherwise decrement
                if (k == 1) {
                    return s;
                }
                k--;
            }
        }
        return "";
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a new hashmap with string key and list of strings values
        Map<String, ArrayList<String>> map = new HashMap<>();
        // for each loop through given strs array
        for (String s : strs) {
            // Convert String to character array
            char[] chars = s.toCharArray();
            // Sort characters in s
            Arrays.sort(chars);
            // convert back to String
            String key = new String(chars);
            // check if hashmap contains the key (sorted string)
            if (!map.containsKey(key)) {
                // if not, add a new key value on it
                map.put(key, new ArrayList<>());
            }
            // based on key, add string s
            map.get(key).add(s);
        }
        // return new array list that contains the hashmap values which is another array list
        return new ArrayList<>(map.values());
    }
}

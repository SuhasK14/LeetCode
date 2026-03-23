class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // put nums1 array into a hashmap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            // map each value as a key and number of times it appears as the value (increment)
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // list to add values that appear in both arrays
        List<Integer> resultsList = new ArrayList<>();
        for (int i : nums2) {
            // if map contains value > 0, add to list and decrement value of that index i
            if (map.getOrDefault(i, 0) > 0) {
                resultsList.add(i);
                map.put(i, map.getOrDefault(i, 0) - 1);
            }
        }
        // convert list to array and return
        int[] results = new int[resultsList.size()];
        for (int i = 0; i < resultsList.size(); i++) {
            results[i] = resultsList.get(i);
        }
        return results;
    }
}

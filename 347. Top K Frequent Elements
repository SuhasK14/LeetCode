class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // loop through nums and add i as key and increment value by 1 in hashmap
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        // create an array of lists using the keys as frequencies,
        // storing all the values that appeared the same number of times in the same list<Integer> "bucket"
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        // Loop through hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // use hashmap keys as value to add to List<Integer> bucket
            int num = entry.getKey();
            // use hashmap value as key for array index to see what bucket it goes to
            int frequency = entry.getValue();

            // if frequency not met before, add new array list for it (create bucket)
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            // add num to frequency
            buckets[frequency].add(num);
        }

        // get last k indexes and return as int[]
        int[] result = new int[k];
        int counter = 0;
        // loop through array of lists (buckets)
        for (int i = buckets.length - 1; i >= 0 && counter < k; i--) {
            // check if not null
            if (buckets[i] != null) {
                // loop through list at index
                for (int num : buckets[i]) {
                    // add to result and increment counter
                    result[counter] = num;
                    counter++;
                    // check if counter not going past K limit
                    if (counter == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}

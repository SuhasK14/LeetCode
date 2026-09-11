class Solution {
    public int findLucky(int[] arr) {
        // create and fill out hashmap with all values in arr
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            // key is n and value is freq
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        // find largest key in hashmap that is the same as its value; -1 if does not exist
        int lucky = -1;
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                lucky = Math.max(lucky, key);
            }
        }
        return lucky;

        // Optimal Space Solution: use array of size 501, since values have to be between 1 - 500, inclusive
    }
}

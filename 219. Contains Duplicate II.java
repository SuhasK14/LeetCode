class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // store in hashmap using array value as key, and index as value
        HashMap<Integer, Integer> map = new HashMap<>();
        // loop through array nums, updating map values and checking condition
        for (int i = 0; i < nums.length; i++) {
            // condition: check if k is satisfied, if key exists
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) {
                return true;
            }
            // update or add key/value
            map.put(nums[i], i);
        }
        return false; // return false if nothing satisfied in loop
    }
}

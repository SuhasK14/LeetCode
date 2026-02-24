class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Use a hashmap to store key value pairs (key = value at index) (value = index)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Find the number you are looking for, the one to make the target number
            int complement = target - nums[i];
            // if the hashmap contains the number to make target number, return the value (index) and the current index i
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            // if no target match, then add to hashmap to see if a future number matches with it
            // key should be the value at index, since that is what is we are searching for to make the target number
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}

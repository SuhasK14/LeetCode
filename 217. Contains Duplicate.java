class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create hashset not hashmap as we are just checking for the values in nums, indexes do not matter
        Set<Integer> set  = new HashSet<>();
        for (int i : nums) {
            // set.contains checks if that value is present
            if (set.contains(i)) {
                return true;
            }
            // if not add num to set
            set.add(i);
        }
        return false;
    }
}

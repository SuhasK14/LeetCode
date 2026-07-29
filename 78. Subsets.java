class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Start the process with an empty current subset and index 0
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, int start) {
        // 1. Every path we take forms a valid subset, so add a COPY of current to result
        result.add(new ArrayList<>(current));
        // 2. Loop through the remaining choices
        for (int i = start; i < nums.length; i++) {
            // Make a choice: Add the current element
            current.add(nums[i]);
            // Move forward: Recursively call backtrack with the NEXT index
            backtrack(result, current, nums, i + 1);
            // Undo the choice: Remove the last element to try other options
            current.remove(current.size() - 1);
        }
    }
}

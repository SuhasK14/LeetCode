class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // use visited to prevent same number being added
        boolean[] visited = new boolean[nums.length];
        backtrack(result, nums, new ArrayList<>(), visited);
        return result;
    }
    private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> current, boolean[] visited) {
        // if current list is same size of nums length, then add to result
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // skip if number has already been added
            if (visited[i]) continue;
            // add number at i and set boolean at i to true 
            current.add(nums[i]);
            visited[i] = true;
            // recursively call
            backtrack(result, nums, current, visited);
            // backtrack: remove last added
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}

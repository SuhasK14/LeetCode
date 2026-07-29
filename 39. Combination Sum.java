class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // call base case with new empty arraylist and start at 0
        backtrack(result, candidates, new ArrayList<>(), target, 0);
        return result;
    }
    private void backtrack(List<List<Integer>> result, int[] candidates, List<Integer> current, int target, int start) {
        // if target reached, add to result and return
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        // return if target is negative, as candidates are only positive
        else if (target < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            // call backtrack with updated current, target, and i as start (not i + 1 since duplicates are allowed)
            backtrack(result, candidates, current, target - candidates[i], i);
            current.remove(current.size() - 1);  // Backtrack step
        }
    }
}

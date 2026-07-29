class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        // call base case: empty current list, starting index 1
        backtrack(result, new ArrayList<>(), n, k, 1);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> current, int n, int k, int cur) {
        // check if current list length matches k
        if (current.size() == k) {
            // if so, add to result and return
            result.add(new ArrayList<>(current));
            return;
        }
        // Loop from cur index -> n
        for (int i = cur; i <= n; i++) {
            // add the element to current list
            current.add(i);
            // recursively call backtrack with the NEXT index
            backtrack(result, current, n, k, i + 1);
            // remove last element added so space for new element
            current.remove(current.size() - 1);
        }
    }
}

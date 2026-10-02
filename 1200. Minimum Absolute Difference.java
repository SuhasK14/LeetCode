class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        // use Arrays.sort first
        Arrays.sort(arr);
        // loop through left to right to find the min difference
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++){
            int cur = Math.abs(arr[i + 1] - arr[i]);
            if (cur < min) {
                min = cur;
            }
        }
        // using known min, find all subsequent pairs with the same absolute difference
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) == min) {
                results.add(Arrays.asList(arr[i], arr[i+1])); // add new using Arrays.asList
            }
        }
        return results;
    }
}

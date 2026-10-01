class Solution {
    public List<String> summaryRanges(int[] nums) {
        // base case: empty list check
        List<String> ranges = new ArrayList<>();
        if (nums.length == 0) {
            return ranges;
        }
        // loop through nums: set starting point
        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // once current range fails, add to list
            if (nums[i - 1] + 1 != nums[i]) {
                // add correctly to list with or without ->
                if (start == nums[i - 1]) {
                    ranges.add("" + start);
                } else {
                    ranges.add(start + "->" + nums[i - 1]);
                }
                start = nums[i]; // move start to current val
            }
        }
        // add last value to ranges and return
        if (start == nums[nums.length - 1]) {
            ranges.add("" + start);
        } else {
            ranges.add(start + "->" + nums[nums.length - 1]);
        }
        return ranges;
    }
}

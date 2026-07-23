class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // only positive numbers ahead, 0 cannot be achieved
            if (nums[i] > 0) {
                break;
            }
            // two pointers approach using for loop as index as first element,
            // then check for other 2 elements to make all 3 equal to 0 (two sum problem)
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int count = nums[i] + nums[left] + nums[right];
                if (count == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // skip duplicates (value matters not index)
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // move inward after adding elements, since we can't repeat
                    right--;
                    left++;
                } else if (count > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}

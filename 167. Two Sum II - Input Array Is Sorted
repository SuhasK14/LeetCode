class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // left and right pointers
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            // get values at left and right parameters
            int low = numbers[left];
            int high = numbers[right];
            // compare left + right value with target and loop through
            if (low + high < target) {
                left++;
            } else if (low + high > target) {
                right--;
            } else {
                // return left and right indexes + 1 per problem parameters as new int array
                return new int[]{left + 1, right + 1};
            }
        }
        // return null to satisfy function; guaranteed one solution 
        return null;
    }
}

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        // two pointer approach, starting from ends
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            // calculate new max using min of both ends multiplied by distance between
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            // move pointers based on which end is greater: move the lower one
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}

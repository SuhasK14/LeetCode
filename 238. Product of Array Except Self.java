class Solution {
    public int[] productExceptSelf(int[] nums) {
        // length variable
        int length = nums.length;
        // left and right products arrays
        int[] leftProducts = new int[length];
        int[] rightProducts = new int[length];
        // set left products array
        leftProducts[0] = 1;
        for (int i = 1; i < length; i++)
        {
            leftProducts[i] = nums[i - 1] * leftProducts[i - 1];
        }
        // set right products array
        rightProducts[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--)
        {
            rightProducts[i] = nums[i + 1] * rightProducts[i + 1];
        }
        // set output array
        int[] output = new int[length];
        for (int i = 0; i < length; i++)
        {
            output[i] = leftProducts[i] * rightProducts[i];
        }
        // return output
        return output;
    }
}

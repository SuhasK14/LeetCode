class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end1 = m - 1;
        int end2 = n - 1;
        int end = m + n - 1;
        // loop through while end1 and end2 aren't negative
        while (end1 >= 0 && end2 >= 0) {
            if (nums1[end1] >= nums2[end2]) {
                // if end1 is higher, then append to end and move position down
                nums1[end] = nums1[end1];
                end1--;
            } else {
                // if end2 is higher, then append to end and move position down
                nums1[end] = nums2[end2];
                end2--;
            }
            // end position moves down
            end--;
        }
        // if there are any remaining nums on the second array, append to nums1
        while (end2 >= 0) {
            nums1[end] = nums2[end2];
            end2--;
            end--;
        }
    }
}

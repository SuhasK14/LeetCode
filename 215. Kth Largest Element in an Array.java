class Solution {
    public int findKthLargest(int[] nums, int k) {
        // minHeap means poll or peek will extract the smallest remaining element
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // add each num to the heap
        for (int n : nums) {
            minHeap.offer(n);
            // if heap is greater than k, cut off the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        // return the smallest element in the heap (last element of the top k elements)
        return minHeap.peek();
    }
}

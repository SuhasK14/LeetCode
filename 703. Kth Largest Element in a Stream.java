/*
    Goal of Kth largest is to maintain k elements that are the greatest. For example, if we have k = 5, 
    we can only have the 5 largest elements in the priority queue. We use a minHeap as this return the smallest element on peek. 
    If we are already at 5 elements and have to add a new value, we add the value and then call poll to remove the smallest. 
    This brings us down to 5 elements while mainting the largest k elements.
*/
class KthLargest {
    // instance variables so that both methods can act on them
    private int k;
    private PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        // set global variables to passed in parameters
        minHeap = new PriorityQueue<>();
        this.k = k;
        // initialize heap using add method call
        for (int n : nums) {
            add(n);
        }
    }
    
    public int add(int val) {
        // add val to heap and evaluate
        minHeap.offer(val);
        // if the size of the minHeap is greater than k, remove smallest element. 
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        // return the smallest value, as that is the Kth largest element 
        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

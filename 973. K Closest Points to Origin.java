class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // create priority queue with custom function to take in and compare int[]
        // swap b and a since we want max heap, as largest value gets removed and smallest stays
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((b, a) -> {
            // calculate distances to origin for a and b and compare
            int distA = a[0] * a[0] + a[1] * a[1];
            int distB = b[0] * b[0] + b[1] * b[1];
            return Integer.compare(distA, distB);
        });
        // loop through points and add to max heap
        for (int[] coords : points) {
            maxHeap.offer(coords);
            // if max heap is over k, remove the largest remaining point
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        // return heap converted to array (pass in new int[0][] for proper object formatting)
        return maxHeap.toArray(new int[0][]);
    }
}

class RecentCounter
{
    // Create a queue interface
    Queue<Integer> queue;

    public RecentCounter()
    {
        // implement queue using linkedlist
        queue = new LinkedList<>();
    }
    
    public int ping(int t)
    {
        queue.add(t);
        // while the queue is not empty and the values are not within 3000 of t
        while (!queue.isEmpty() && (t - 3000 > queue.peek()))
        {
            // poll() removes the first element in the queue
            queue.poll();
        }
        // returns size of queue
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

class MyStack {
    /*
        q.offer(x) — adds to the back (like push)
        q.poll() — removes from the front (like dequeue)
        q.peek() — looks at the front without removing
        q.size() — number of elements
        q.isEmpty() — check if empty
    */
    Queue<Integer> queue = new LinkedList<>();

    public MyStack() {

    }
    
    public void push(int x) {
        // add element to queue using offer
        queue.offer(x);
        // (element is not in back of queue but should be in front due to stack LIFO)
        for (int i = 0; i < queue.size() - 1; i++) {
            // loop through and re-add elements from front to back
            // stop 1 before end so element just added is not moved, and is at the front to match stack LIFO
            queue.offer(queue.poll());
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

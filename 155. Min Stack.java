class MinStack {
    // Need to use second stack to track minimum element, as lowest element could be popped off
    // minStack will then go to the previous lowest element if popped, and so on ....
    Stack<Integer> minStack;
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        // if min stack is empty or current value being pushed is less than current lowest value, then push to stack
        if (minStack.empty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    /*
        Any subsequent greater values getting pushed will have to be popped for it to come back to the smallest element.
        The current smallest element can never be reached until the values above are popped, so can't be affected.
    */
    public void pop() {
        int popped = stack.pop();
        // if current value = min stack value, then the lowest value is being popped
        if (popped == minStack.peek()) {
            // remove value from both stacks then
            minStack.pop();
        }
    }
    // Methods pop, top and getMin operations will always be called on non-empty stacks.
    // both methods return peek value on corresponding stack
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
}

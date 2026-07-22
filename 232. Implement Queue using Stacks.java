class MyQueue {
    // stack to be used across all queue functions
    Stack<Integer> stack;
    // boolean val checking if stack is reversed (reversed = queue)
    boolean reverse;
    public MyQueue() {
        // Initiate
        stack = new Stack<>();
        reverse = false;
    }
    
    public void push(int x) {
        Stack<Integer> pStack = new Stack<>();
        if (!reverse) {
            // if not reversed, then push new value to new stack and add old values on
            pStack.push(x);
            while (!stack.isEmpty()) {
                pStack.push(stack.pop());
            }
            stack = pStack;
            // stack is now reversed as new value is on bottom, which is queue akin
            reverse = true;
        } else {
            // add all stack values to bottom reversed and add new value to top
            while (!stack.isEmpty()) {
                pStack.push(stack.pop());
            }
            pStack.push(x);
            // stack not reversed, NOT queue-like
            reverse = false;
        }
        stack = pStack;
    }
    
    public int pop() {
        Stack<Integer> pStack = new Stack<>();
        int val = 0;
        // if reverse/queue-like, then oldest val will be a top, so stack.pop() suffices
        if (reverse) {
            val = stack.pop();
        } else {
            // oldest val is at bottom, so have to pop off whole stack onto a new stack except the last element
            while (!stack.isEmpty()) {
                val = stack.pop();
                if (!stack.isEmpty()) {
                    pStack.push(val);
                }
            }
            stack = pStack;
            // stack is reversed after popping off all elements
            reverse = true;
        }
        // return removed value
        return val;
    }
    
    public int peek() {
        Stack<Integer> pStack = new Stack<>();
        int val = 0;
        // if reverse/queue-like, then oldest val will be a top, so stack.peek() suffices
        if (reverse) {
            val = stack.peek();
        } else {
            // oldest val is at bottom, so have to pop off whole stack onto a new stack
            while (!stack.isEmpty()) {
                val = stack.pop();
                pStack.push(val);
            }
            stack = pStack;
            reverse = true;
        }
        // return value of oldest element (first in queue)
        return val;
    }

    public boolean empty() {
        // same as stack
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

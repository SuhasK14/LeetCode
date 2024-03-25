// Assume pop, top, and getMin are always called when the stack is not empty
// If not, you would have to check if stack is empty or not using if statement

class MinStack
{
    Stack<Integer> stack;
    // Need to use second stack to track minimum element, as lowest element could be popped off
    // minStack will then go to the previous lowest element if popped
    Stack<Integer> minStack;

    public MinStack()
    {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val)
    {
        stack.push(val);
        // val <= peek is correct. val < peek is NOT correct **IMPORTANT**
        if (minStack.empty() || val <= minStack.peek())
        {
            minStack.push(val);
        }
    }
    
    public void pop()
    {
        int popped = stack.pop();
        if (popped == minStack.peek())
        {
            minStack.pop();
        }
    }
    
    public int top()
    {
        return stack.peek();
    }
    
    public int getMin()
    {
        return minStack.peek();
    }
}

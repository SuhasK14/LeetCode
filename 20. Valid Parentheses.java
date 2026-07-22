class Solution {
    public boolean isValid(String s) {
        // need to use stack since order matter regarding when open and close parentheses can be used
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // push open parentheses too stack since they can be nested
                stack.push(c);
            } else {
                // need empty check since calling stack.pop on empty stack gives error
                // which can happen if closed parentheses comes before open one
                if (stack.isEmpty()) {
                    return false;
                }
                // pop stack to see if open parentheses matches the closed one; return false if not
                char top = stack.pop(); // calling stack.pop returns the element and also removes the element as well
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }
        // make sure no extra characters are left 
        return stack.isEmpty();
    }
}

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }
    // helper method to call on both strings
    private String backspace(String s) {
        // use stack to pop last used character if # comes up
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(s.charAt(i));
        }
        // build string from whatever characters remain in stack
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch); // Iterates from bottom to top
        }
        return sb.toString(); // return as string
    }
}

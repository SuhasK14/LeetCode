class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // create new array to hold how many days till warmer temp. return this
        int[] answer = new int[temperatures.length];
        // use stack to hold values that dont have a warmer day ahead yet and push first day (guaranteed one day)
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        // loop through temperatures and push each day to stack starting from 1
        for (int i = 1; i < temperatures.length; i++) {
            // before pushing check if current day is warmer than previous days using a while loop 
            // if so, update answer array with i - top of stack and pop stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return answer;
    }
}

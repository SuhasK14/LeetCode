class Solution {
    public String reorganizeString(String s) {
        // store values of string in character hashmap
        HashMap<Character, Integer> map = new HashMap<>();
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            char c = sChars[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // Priority Queue of Max Heap where largest value is returned, second index of int[]
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        // loop through entries in hashmap and add to priority queue
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            // base check to see if there is a possible answer
            if (entry.getValue() > (s.length() + 1) / 2) {
                return "";  
            }
            maxHeap.offer(new int[] {entry.getKey(), entry.getValue()});
        }
        // create string to satisfy conditions
        StringBuilder result = new StringBuilder();
        while (maxHeap.size() >= 2) {
            // get next two highest recurring elements 
            int[] first = maxHeap.poll();
            int[] second = maxHeap.poll();
            // add both elements and decrement value (number of times appeared)
            result.append((char) first[0]);
            first[1]--;
            result.append((char) second[0]);
            second[1]--;
            // add back to heap if there are still more values (> 0)
            if (first[1] > 0) {
                maxHeap.offer(first);
            }
            if (second[1] > 0) {
                maxHeap.offer(second);
            }
        }
        // if there is still an element on the heap, then add to result
        // has to be valid as we checked the base case when we populated the heap
        if (!maxHeap.isEmpty()) {
            result.append((char) maxHeap.poll()[0]);
        }
        // return result converted to string
        return result.toString();
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        // Initialize a variable to store the XOR sum
        int num = 0; 
        // Iterate through every integer in the input array
        for (int i : nums) { 
            // Apply the XOR bitwise operation (^) between the running total and current element.
            // Properties of XOR applied here:
            // 1. X ^ X = 0 (Any number XORed with itself cancels out to 0)
            // 2. X ^ 0 = X (Any number XORed with 0 stays the same)
            // Duplicate numbers will pair up and cancel each other out, leaving only the unique number.
            num = num ^ i; 
        } 
        // Return the final remaining number, which is the single unique element
        return num; 
    } 
}

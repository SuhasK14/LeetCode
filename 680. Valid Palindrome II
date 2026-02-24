class Solution {
    public boolean validPalindrome(String s) {
        // two pointers approach
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // if not palindrome, check if letter on left or right can be deleted
            if (s.charAt(left) != s.charAt(right)) {
                if(isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1)) {
                    // return early true as palindrome is already checked in helper function
                    return true;
                }
                // if no palindrome even after deleting, then return false
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // helper function to check if palindrome
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

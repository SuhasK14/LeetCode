class Solution {
    public boolean isPalindrome(int x) {
        // if negative, x cannot be a palindrome
        if (x < 0) {
            return false;
        }
        int orignal = x;
        // get reverse of x
        long reverse = 0;
        while (x > 0) {
            int mod = x % 10;
            x = x / 10;
            reverse = reverse * 10 + mod;
        }
        // compare both, if equal, then it is palindrome and return true
        if (reverse - orignal == 0) {
            return true;
        }
        return false;
    }
}

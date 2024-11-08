/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // implememt binary search
        int left = 1;
        int right = n;
        // can loop forever since guess is guaranteed to be from 1 to n
        while(true) {
            int mid = left + (right - left) / 2;
            int res = guess(mid);
            // equal to guess, return!
            if (res == 0) {
                return mid;
            }
            // guess too high
            else if (res == -1) {
                right = mid - 1;
            }
            // guess too low
            else {
                left = mid + 1;
            } 
        }
    }
}

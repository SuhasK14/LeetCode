/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl
{
    public int firstBadVersion(int n)
    {
        // binary search algorithm... cut in half each time
        int low = 1;
        int high = n;
        while(low <= high)
        {
            // mid = (low + high) / 2 does not work as low + high may lead to a greater integer than the integer scope
            // For example, the maximum number an int can hold is 2147483647, and if high = 1787483647, low = 2131231233
            // This will lead to an integer overflow error causing the program to fail.
            // Therefore, the following version is used, as mid is ensured never to go over the high value.
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid))
            {
                // if mid is a bad version, move value to left as all values right including itself are false
                high = mid - 1;
            }
            else
            {
                // if mid is a correct verion, move value to right one as all values left including itself are true
                low = mid + 1;
            }
        }
        // low will contain the last true value + 1
        // the last true value implies the next value is false and that is what we are looking for:
        // the first bad version, as versions after will be bad
        return low;
    }
}

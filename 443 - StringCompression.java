class Solution
{
    public int compress(char[] chars)
    {
        // base case
        if (chars.length == 1)
        {
            return 1;
        }
        // length of output array
        int length = 0;
        // count of current character in chars
        // default is 1, as a character starts as 1 (itself)
        int tempCount = 1;
        // loop through chars array
        for (int i = 1; i <= chars.length; i++)
        {
            if (i == chars.length || chars[i] != chars[i - 1])
            {
                // if current character is nonexistent (at the end)
                // or if current character is different from previous character
                // that means the group of consecutive character has ended
                // store previous group character in array
                chars[length] = chars[i - 1];
                length++;
                // store previous group character length in array
                if (tempCount > 1)
                {
                    // if number of character is two digits, then each digit needs
                    // to be stored individually in chars
                    for (char digit : String.valueOf(tempCount).toCharArray())
                    {
                        chars[length] = digit;
                        length++;
                    }
                }
                // reset tempCount to 1 for the next different character
                tempCount = 1;
            }
            // if current character is same as previous character
            else
            {
                // add 1 to tempCount and continue with loop
                tempCount++;
            }
        }
        // return length of the new array chars
        return length;
    }
}

class Solution
{
    public String gcdOfStrings(String str1, String str2)
    {
        // check if strings even have a common divisor
        if (!(str1 + str2).equals(str2 + str1))
        {
            // if they dont, then return empty string ""
            return "";
        }
        // call gcd
        int len = gcd(str1.length(), str2.length());
        // return gcd of strings
        return str1.substring(0, len);
    }
    // Euclidean Algorithm
    private int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        else
        {
            // recursive call
            return gcd(b, a % b);
        }
    }
}

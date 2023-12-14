class Solution
{
    public int maxVowels(String s, int k)
    {
        int max = 0;
        int vowels = 0;
        int counter = 0;

        char[] curr = new char[k];
        for (int i = 0; i < k; i++)
        {
            curr[i] = s.charAt(i);
            if (isVowel(s.charAt(i)))
            {
                vowels++;
            }
            max = Math.max(max, vowels);
        }

        for (int i = k; i < s.length(); i++)
        {
            if (isVowel(curr[counter]))
            {
                vowels--;
            }
            curr[counter] = s.charAt(i);
            if (isVowel(s.charAt(i)))
            {
                vowels++;
            }
            // increment then evaluate
            if (++counter == k)
            {
                counter = 0;
            }
            max = Math.max(max, vowels);
        }
        
        return max;
    }

    // method to check if paramter character is a vowel
    public boolean isVowel(char c)
    {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            return true;
        }
        return false;
    }
}

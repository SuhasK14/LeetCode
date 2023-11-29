class Solution
{
    public String mergeAlternately(String word1, String word2)
    {
        int length = Math.max(word1.length(), word2.length());
        String merge = "";
        for (int i = 0; i < length; i++)
        {
            if (i < word1.length())
            {
                if (word1.substring(i, i + 1) != null)
                {
                    merge += word1.substring(i, i + 1);
                }
            }
            if (i < word2.length())
            {
                if (word2.substring(i, i + 1) != null)
                {
                    merge += word2.substring(i, i + 1);
                }
            }
        }
        return merge;
    }
}

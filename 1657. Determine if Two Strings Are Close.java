class Solution
{
    public boolean closeStrings(String word1, String word2)
    {
        if (word1.length() != word2.length())
        {
            return false;
        }
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++)
        {
            if (map1.containsKey(word1.charAt(i)))
            {
                int num = map1.get(word1.charAt(i));
                map1.put(word1.charAt(i), ++num);
            }
            else
            {
                map1.put(word1.charAt(i), 1);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word2.length(); i++)
        {
            if (map2.containsKey(word2.charAt(i)))
            {
                int num = map2.get(word2.charAt(i));
                map2.put(word2.charAt(i), ++num);
            }
            else
            {
                map2.put(word2.charAt(i), 1);
            }
        }

        // check if all letters present in both words
        for (Character key : map1.keySet())
        {
            if (!map2.containsKey(key))
            {
                return false;
            }
        }

        // check if same number of times letters appear in both words
        ArrayList<Integer> val1 = new ArrayList<>();
        for(int value : map1.values())
        {
            val1.add(value);
        }

        ArrayList<Integer> val2 = new ArrayList<>();
        for(int value : map2.values())
        {
            val2.add(value);
        }

        Collections.sort(val1);
        Collections.sort(val2);

        if (val1.equals(val2))
        {
            return true;
        }

        return false;
    }
}

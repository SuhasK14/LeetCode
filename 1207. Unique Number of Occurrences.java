class Solution
{
    public boolean uniqueOccurrences(int[] arr)
    {
        // create a map to count the number of occurrences of each value in arr
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        // loop through arr and map all
        for (int i = 0; i < arr.length; i++)
        {
            if (occurrences.containsKey(arr[i]))
            {
                int temp = occurrences.get(arr[i]);
                occurrences.put(arr[i], ++temp);
            }
            else
            {
                occurrences.put(arr[i], 1);
            }
        }
        // create a hashset of the values in hashmap occurrences
        HashSet<Integer> values = new HashSet<>(occurrences.values());
        // return true or false based on if the sizes match
        return occurrences.size() == values.size();
    }
}

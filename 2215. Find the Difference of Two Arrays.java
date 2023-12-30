class Solution
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2)
    {
        // Create and populate hashtable for all the values in provided nums1 array
        HashMap<Integer, String> map1 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++)
        {
            map1.put(nums1[i], "");
        }

        // Create and populate hashtable for all the values in provided nums2 array
        HashMap<Integer, String> map2 = new HashMap<>();
        for (int i = 0; i < nums2.length; i++)
        {
            map2.put(nums2[i], "");
        }

        // Check if nums2 has the same value as nums1 using their respective maps
        // If not, add value to distinct1 integer array
        ArrayList<Integer> distinct1 = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++)
        {
            if (map2.containsKey(nums1[i]))
            {
                continue;
            }
            else
            {
                distinct1.add(nums1[i]);
                // put value in map2 to avoid duplicates
                map2.put(nums1[i], "");
            }
        }

        // Check if nums1 has the same value as nums2 using their respective maps
        // If not, add value to distinct2 integer array
        ArrayList<Integer> distinct2 = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++)
        {
            if (map1.containsKey(nums2[i]))
            {
                continue;
            }
            else
            {
                distinct2.add(nums2[i]);
                // put value in map1 to avoid duplicates
                map1.put(nums2[i], "");
            }
        }

        List<List<Integer>> list = Arrays.asList(distinct1, distinct2);

        return list;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution
{
    public int maxLevelSum(TreeNode root)
    {
        // Map to contain levels in key and total sum of level in value 
        Map<Integer, Integer> sums = new HashMap<>();
        // call getSums to populate Map sums
        getSums(root, sums, 1);
        // iterate over map to get level with the maximum value
        int maxLevel = 1;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : sums.entrySet())
        {
            if (entry.getValue() > max)
            {
                max = entry.getValue();
                maxLevel = entry.getKey();
            }
        }
        // return level with maximum value
        return maxLevel;
    }
    // get sums of each level and populate in sums
    public void getSums(TreeNode root, Map<Integer, Integer> sums, int level)
    {
        // base case
        if (root == null)
        {
            return;
        }
        // check if exists, if not put value without adding to previous value, since there was no value
        if (sums.get(level) == null)
        {
            sums.put(level, root.val);
        }
        else
        {
            sums.put(level, (sums.get(level) + root.val));
        }
        // Traverse recursively call with updated level
        getSums(root.left, sums, level + 1);
        getSums(root.right, sums, level + 1);
    }
}

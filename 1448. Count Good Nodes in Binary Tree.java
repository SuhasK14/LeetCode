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
    // global count variable
    int count = 0;
    // main function
    public int goodNodes(TreeNode root)
    {
        if (root.left == null && root.right == null)
        {
            return 1;
        }

        findGoodNodes(root, Integer.MIN_VALUE);

        return count;
    }
    // traverse through tree and increment to count if good node
    public void findGoodNodes(TreeNode root, int max)
    {
        // base case to avoid errors when calling right and left on root
        if (root == null)
        {
            return;
        }
        // update count conditionally
        if (root.val >= max)
        {
            count++;
            max = Math.max(max, root.val);
        }
        // traverse
        findGoodNodes(root.left, max);
        findGoodNodes(root.right, max);
    }
}

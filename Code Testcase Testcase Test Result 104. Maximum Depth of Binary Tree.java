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
    public int maxDepth(TreeNode root)
    {
        // base case
        if (root == null)
        {
            return 0;
        }

        // recursively call right and left roots
        int rightDepth = maxDepth(root.right);
        int leftDepth = maxDepth(root.left);

        // get maximum depth, add 1 for current root
        return Math.max(rightDepth, leftDepth) + 1;
    }
}

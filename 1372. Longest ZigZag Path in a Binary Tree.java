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
    int max = 0;
    public int longestZigZag(TreeNode root)
    {
        // base case
        if (root.left == null && root.right == null)
        {
            return 0;
        }
        // call dfs on left(1) and right(2)
        dfs(root.left, 0, 1);
        dfs(root.right, 0, 2);
        // return global variable max
        return max;
    }
    public void dfs(TreeNode root, int cur, int dir)
    {
        // check for max with cur
        max = Math.max(max, cur);
        // base case
        if (root == null)
        {
            return;
        }
        // traverse
        if (dir == 1)
        {
            dfs(root.right, cur + 1, 2);
            dfs(root.left, 0, 1);
        }
        else if (dir == 2)
        {
            dfs(root.left, cur + 1, 1);
            dfs(root.right, 0, 2);
        }
    }
}

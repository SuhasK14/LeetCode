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

 /*
 Code runs with a time complexity of O(N^2).
 We first recursively traverse all the nodes in the tree.
 Then, we call dfs on each one, which then traverses all the nodes again using that node as the root.
 We traverse the tree using recursion twice.
 */
class Solution
{
    int count = 0;
    public int pathSum(TreeNode root, int targetSum)
    {
        // base case
        if (root == null)
        {
            return 0;
        }
        // find all paths that stem from this root node using depth first search (dfs)
        dfs(root, targetSum);
        // traverse left and right subtrees, so that dfs is called on all nodes
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        // return global variable count
        return count;
    }
    // given root node, traverse all paths stemming from it, checking for targetSum
    private void dfs(TreeNode root, long sum)
    {
        // base case
        if (root == null)
        {
            return;
        }
        // check if equals, then add 1
        if (root.val == sum)
        {
            count++;
        }
        // Convert sum to long to avoid overflow
        long newSum = (long) sum - root.val;
        // Traverse left and right on node and pass updated sum value
        dfs(root.left, newSum);
        dfs(root.right, newSum);
    }
}

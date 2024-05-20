/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        // call dfs to run traversal through tree
        return dfs(root, p, q);
    }
    // dfs
    public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q)
    {
        // base case to check if root is equal to p or q
        if (root == p || root == q || root == null)
        {
            return root;
        }

        // Traverse left and right nodes to find p,q
        TreeNode left = dfs(root.left, p, q);
        TreeNode right = dfs(root.right, p, q);

        // both left and right contain p,q so return root of both
        if (left != null && right != null)
        {
            return root;
        }
        // left contains p,q and right does not, so return left
        else if (left != null && right == null)
        {
            return left;
        }
        // right contains p,q and left does not, so return right
        // last case remaining, as it is guaranteed that p,q are found in tree
        else
        {
            return right;
        }
    }
}

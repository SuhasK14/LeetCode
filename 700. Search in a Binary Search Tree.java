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
    /*
    Binary Search Trees are organized trees where greater values go on right and lesser values go on left.
    */
    public TreeNode searchBST(TreeNode root, int val)
    {
        // base case
        if (root == null)
        {
            return null;
        }
        // if root value is target value than return root
        if (root.val == val)
        {
            return root;
        }
        // if root value is less than target value, than go right
        else if (root.val < val)
        {
            return searchBST(root.right, val);
        }
        // if root value is greater than target value, than go left 
        else
        {
            return searchBST(root.left, val);
        }
    }
}

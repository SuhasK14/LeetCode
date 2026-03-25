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
class Solution {
    public int maxDepth(TreeNode root) {
        // no node so max depth is 0
        if (root == null) {
            return 0;
        }
        // recursively get max depth of left and right 
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        // compare the greater of left and right and add 1 for current node
        return Math.max(left, right) + 1;
    }
}

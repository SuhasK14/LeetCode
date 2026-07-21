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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        // call helper method
        return isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode a, TreeNode b) {
        // if both are null, then they are symmetric
        if (a == null && b == null) {
            return true;
        }
        // if values dont match or either node is null (both can't because of prior condition), return false
        else if (a == null || b == null || a.val != b.val) {
            return false;
        }
        // recursively call isMirror on corresponding nodes (left and right) and (right and left)
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}

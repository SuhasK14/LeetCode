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
    public TreeNode invertTree(TreeNode root) {
        // null check before calling .right and .left
        if (root == null) {
            return null;
        }
        // if either has value, then switch right and left
        if (root.right != null || root.left != null) {
            // recursively call on right and left and set equal to opposite (invert)
            TreeNode temp = invertTree(root.right);
            root.right = invertTree(root.left);
            root.left = temp;
        }
        // return final inverted root
        return root;
    }
}

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
     public boolean isValidBST(TreeNode root) {
        // pass null for min/max for root node
        return validate(root, null, null);
    }
    
    private boolean validate(TreeNode node, Integer min, Integer max) {
        // An empty tree/leaf child is always valid
        if (node == null) {
            return true;
        }
        // left subtree check: no node on left side can be greater than any parent node
        if (max != null && node.val >= max) {
            return false;
        }
        // right subtree check: no node on right side can be smaller than any parent node
        if (min != null && node.val <= min) {
            return false;
        }
        // traverse left subtree with updated max value (current node val)
        if (!validate(node.left, min, node.val)) {
            return false;
        }
        // traverse right subtree with updated min value (current node val)
        if (!validate(node.right, node.val, max)) {
            return false;
        }
        return true;
    }
}

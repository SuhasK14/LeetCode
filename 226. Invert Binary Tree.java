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
        // null check on root
        if (root == null) {
            return null;
        }
        // swap left and right nodes of root
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        // call left and right subtrees of root
        invertTree(root.left);
        invertTree(root.right);
        // return root
        return root;
    }
}

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // check if both trees are not null, so right/left/val doesn't give null exception
        if (p != null && q != null) {
            // check that the values of the nodes equal each other
            if (p.val == q.val) {
                // since all checks on two current nodes, recursively check left and right on btoh trees
                boolean left = isSameTree(p.left, q.left);
                boolean right = isSameTree(p.right, q.right);
                // return results tied together &&
                return left && right;
            }
            return false;
        }
        // if both tree are null, they are technically equal so return true
        else if (p == null && q == null) {
            return true;
        }
        // if it reaches this condition, one tree is null and the other isn't, making them not equal so return false
        else {
            return false;
        }
    }
}

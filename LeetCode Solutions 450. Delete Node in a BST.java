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
    public TreeNode deleteNode(TreeNode root, int key)
    {
        // base case
        if (root == null)
        {
            return null;
        }
        // root value is equal to key
        if (root.val == key)
        {
            // if left child is null, than just set root to right child, effectively deleting old root
            if (root.left == null)
            {
                return root.right;
            }
            // if right child is null, than just set root to left child, effectively deleting old root
            else if (root.right == null)
            {
                return root.left;
            }
            // if both child nodes are present, we will take the min node in right subtree and set it to root
            else
            {
                // find min node in right subtree
                TreeNode minNode = getMin(root.right);
                // delete said min node in right subtree
                root.right = deleteNode(root.right, minNode.val);
                // set child nodes of min node to old root child nodes
                minNode.left = root.left;
                minNode.right = root.right;
                // set root to min node, effectively deleting it by replacing it
                root = minNode;
            }
        }
        // root value is less than < key
        else if (root.val < key)
        {
            // traverse right (go greater)
            root.right = deleteNode(root.right, key);
        }
        // root value is greater than > key
        else
        {
            // traverse less (go lesser)
            root.left = deleteNode(root.left, key);
        }
        return root;
    }
    // get minimum value in root node
    private TreeNode getMin(TreeNode node)
    {
        // Keep going to left node to find least node
        while (node.left != null)
        {
            node = node.left;
        }
        return node;
    }
}

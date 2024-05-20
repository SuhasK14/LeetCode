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
    public List<Integer> rightSideView(TreeNode root)
    {
        // ArrayList is a data structure and object. All objects by default are passed by REFERENCE.
        // If a function or call changes an ArrayList, it will be updated GLOBALLY (Like a global variable)
        List<Integer> list = new ArrayList<Integer>();
        // call bfs with root, list, and default depth of 0
        bfs(root, list, 0);

        return list;
    }
    public void bfs(TreeNode root, List<Integer> list, int depth)
    {
        // base case
        if (root == null)
        {
            return;
        }
        // if depth equals size of list, than this is a new level and add variable
        if (depth == list.size())
        {
            list.add(root.val);
        }
        // call right first since we want rightmost variable in each level
        bfs(root.right, list, depth + 1);
        bfs(root.left, list, depth + 1);
    }
}

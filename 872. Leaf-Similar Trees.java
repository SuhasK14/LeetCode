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
    public boolean leafSimilar(TreeNode root1, TreeNode root2)
    {
        List<Integer> leafs1 = new ArrayList<Integer>();
        List<Integer> leafs2 = new ArrayList<Integer>();
        findLeafs(root1, leafs1);
        findLeafs(root2, leafs2);
        return leafs1.equals(leafs2);
    }
    public void findLeafs(TreeNode root, List<Integer> leafs)
    {
        if (root.left == null && root.right == null)
        {
            leafs.add(root.val);
        }
        else if (root.left == null)
        {
            findLeafs(root.right, leafs);
        }
        else if (root.right == null)
        {
            findLeafs(root.left, leafs);
        }
        else
        {
            findLeafs(root.left, leafs);
            findLeafs(root.right, leafs);
        }
        return;
    }
}

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // create list of lists of all the nodes left to right at each level
        List<List<Integer>> result = new ArrayList<>();
        // null check
        if (root == null) {
            return result;
        }
        // Create queue to track nodes we need to visit
        Queue<TreeNode> queue = new LinkedList<>();
        // Start by putting the root node into the queue
        queue.add(root);
        // loop through tree
        while (!queue.isEmpty()) {
            // get current size of level
            int levelSize = queue.size();
            // create new list to store all nodes for this level
            List<Integer> currentLevelList = new ArrayList<>();
            // loop through queue
            for (int i = 0; i < levelSize; i++) {
                // remove from queue and add val to list
                TreeNode currentNode = queue.poll();
                currentLevelList.add(currentNode.val);
                // add children nodes of removed node to back of queue (check for null first)
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            // add level list to list to be returned
            result.add(currentLevelList);
        }
        return result;
    }
}

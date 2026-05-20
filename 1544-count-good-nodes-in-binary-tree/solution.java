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
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }
    private int dfs(TreeNode root, int curMax) {
        if(root == null) {
            return 0;
        }
        int max = Math.max(curMax, root.val);
        if(root.val >= curMax) {
            return 1 + dfs(root.left, max) + dfs(root.right, max);
        }
        return dfs(root.left, max) + dfs(root.right, max);
    }
}

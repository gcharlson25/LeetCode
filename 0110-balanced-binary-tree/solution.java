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
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        TreeNode cur = root;
        if(depth(cur.left) - depth(cur.right) > 1 || depth(cur.left) - depth(cur.right) < -1) {
            return false;
        }
        else {
            return isBalanced(cur.right) && isBalanced(cur.left);
        }
    }
    public int depth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        TreeNode cur = root;
        return 1 + Math.max(depth(cur.left), depth(cur.right));
    }
}

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
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        TreeNode cur = root;
        diameterCalc(cur);
        return diameter;
    }
    public int diameterCalc(TreeNode root) {
        if(root == null) {
            return 0;
        }
        TreeNode cur = root;
        int left = diameterCalc(cur.left);
        int right = diameterCalc(cur.right);
        diameter = Math.max(left + right, diameter);
        return 1 + Math.max(left, right);        
    }
}

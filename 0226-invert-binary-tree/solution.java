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
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) {
            return null;
        }
        TreeNode cur = root;
        stack.push(cur);
        while(!stack.isEmpty()) {
            cur = stack.pop();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;
            if(cur.right != null) {
                stack.push(cur.right);
            }
            if(cur.left != null) {
                stack.push(cur.left);  
            }
        }
        return root;
    }
}

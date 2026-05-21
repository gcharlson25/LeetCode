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
    private int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, inorder.length - 1);
        
    }
    private TreeNode helper(int[] preorder, int[] inorder, int left, int right) {
        if(left > right) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[preIndex]);
        preIndex++;
        int index = 0;
        for(int i = 0; i < inorder.length; i++) {
            if(node.val == inorder[i]) {
                index = i; 
                break;
            }
        }
        node.left = helper(preorder, inorder, left, index - 1);
        node.right = helper(preorder, inorder, index + 1, right);
        return node;
    }
}

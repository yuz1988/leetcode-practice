package set5;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution543 {
    private int maxLen = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxLen;
    }
    
    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int left = height(node.left);
        int right = height(node.right);
        maxLen = Math.max(left+right, maxLen);
        return Math.max(left,right) + 1;
    }
}
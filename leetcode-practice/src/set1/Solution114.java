package set1;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root);
    }
    
    private TreeNode helper(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root;
        }
        
        TreeNode rightHead = root.right;
        if (root.left != null) {
            TreeNode leftTail = helper(root.left);
            leftTail.right = rightHead;
            root.right = root.left;
            root.left = null;
            if (rightHead == null) {
                return leftTail;
            }
        }
        
        return helper(rightHead);
    }
}

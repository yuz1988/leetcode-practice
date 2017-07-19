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
public class Solution563 {
    private int tilt;
        
    public int findTilt(TreeNode root) {
        sum(root);
        return tilt;
    }
    
    private int sum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = sum(node.left);
        }
        if (node.right !=null) {
            right = sum(node.right);
        }
        tilt += Math.abs(left-right);
        return (left+right+node.val);
    }
}
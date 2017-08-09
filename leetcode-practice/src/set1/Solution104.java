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
public class Solution104 {
    
    private int maxDepth = 0;
    
    public int maxDepth(TreeNode root) {
        depth(root, 0);
        return maxDepth;
    }
    
    private void depth(TreeNode root, int d) {
        if (root == null) {
            return;
        }
        d++;
        maxDepth = Math.max(maxDepth, d);
        depth(root.left, d);
        depth(root.right, d);     
    }
}
package set1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution113 {
    
    private List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root, new LinkedList<Integer>(), sum);
        return res;
    }
    
    private void helper(TreeNode node, LinkedList<Integer> list, int sum) {
        if (node == null) {
            return;
        }
        
        list.add(node.val);
        if (node.left == null && node.right == null && node.val == sum) {
            res.add(new LinkedList<Integer>(list));
            list.removeLast();
            return;
        } 
        helper(node.left, list, sum - node.val);
        helper(node.right, list, sum - node.val);
        list.removeLast();
    }
}

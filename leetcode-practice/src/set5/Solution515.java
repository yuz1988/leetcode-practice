package set5;

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
public class Solution515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (list.size() != 0) {
            int max = Integer.MIN_VALUE;
            int size = list.size();
            for (int i=0; i<size; i++) {
                TreeNode top = list.removeFirst();
                max = Math.max(max, top.val);
                if (top.left != null) {
                    list.add(top.left);
                }
                if (top.right != null) {
                    list.add(top.right);
                }   
            }
            res.add(max);
        }
        return res;
    }
}
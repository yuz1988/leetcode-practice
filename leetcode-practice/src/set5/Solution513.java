package set5;

import java.util.ArrayList;
import java.util.List;

public class Solution513 {
	public int findBottomLeftValue(TreeNode root) {
        // breadth-first 
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int res = root.val;
        while (list.size() != 0) {
            res = list.get(0).val;
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode n : list) {
                if (n.left!=null) {
                    temp.add(n.left);
                }
                if (n.right!=null) {
                    temp.add(n.right);
                }
            }
            list = temp;
        }
        return res;
    }
}

// depth-first
//public class Solution513 {
//    
//    private int height;
//    private int res;
//    
//    public int findBottomLeftValue(TreeNode root) {
//        // depth-first 
//        height = 1;
//        res = root.val;
//        traverse(root, 1);
//        return res;
//    }
//    
//    private void traverse(TreeNode node, int depth) {
//        if (node != null) {
//            if (depth > height) {
//                res = node.val;
//                height = depth;
//            }
//            traverse(node.left, depth+1);
//            traverse(node.right, depth+1);
//        }
//    }
//}

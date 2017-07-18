package set4;

import java.util.HashMap;
import java.util.Stack;

public class Solution496 {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int num : nums) {
            while (!stack.empty() && stack.peek()<num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        int[] res = new int[findNums.length];
        for (int i=0; i<findNums.length; i++) {
            res[i] = map.getOrDefault(findNums[i], -1);
        }
        return res;
    }
}

package set3;

import java.util.Stack;

public class Solution331 {
	public class Solution {
	    public boolean isValidSerialization(String preorder) {
	        Stack<String> stack = new Stack<>();
	        String[] strs = preorder.split(",");
	        
	        for (String s : strs) {
	            if (s.equals("#")) {
	                while (!stack.empty() && stack.peek().equals("#")) {
	                    stack.pop();
	                    if (stack.empty() || stack.peek().equals('#')) {
	                        return false;
	                    }
	                    else {
	                        stack.pop(); 
	                    }
	                }
	                stack.push("#");
	            }
	            else {
	                stack.push(s);
	            }
	        }
	        
	        return (stack.size()==1)&&(stack.peek().equals("#")) ;
	    }
	}
}

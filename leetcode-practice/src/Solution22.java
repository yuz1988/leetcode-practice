import java.util.ArrayList;
import java.util.List;

public class Solution22 {
	public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        helper(n, 0, 0, "", list);
        return list;
    }
    
    private void helper(int n, int nLeft, int nRight, String str, List<String> combines) {
        if (nLeft==n && nRight==n) {
            combines.add(str);
            return;
        }
        if (nLeft < n) {
            helper(n, nLeft+1, nRight, str+"(", combines);
        }
        if (nRight < nLeft) {
            helper(n, nLeft, nRight+1, str+")", combines);
        }
    }
}

package set0;
import java.util.ArrayList;
import java.util.List;

public class Solution60 {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int factorial = 1;
        for (int i=1; i<=n; i++) {
            list.add(i);
            factorial *= i;
        }
        return helper(k, factorial/n, list);
    }
    
    private String helper(int k, int factorial, List<Integer> list) {
        int n = list.size();
        if (n==1) {
            return list.get(0)+"";
        }
        
        int x = k / factorial;
        int y = k % factorial;
        if (y==0) {
            x--;
            y = factorial;
        }
        int e = list.remove(x);
        String res = e + helper(y, factorial/(n-1), list);
        return res;
    }
}
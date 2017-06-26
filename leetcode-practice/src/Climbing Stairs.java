public class Solution {
    public int climbStairs(int n) {
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        
        int last = 1;
        int prevLast = 1;
        for (int i=2; i<=n; i++) {
            int current = last + prevLast;
            prevLast = last;
            last = current;
        }
        return last;
    }
}
package set5;

public class Solution598 {
    public int maxCount(int m, int n, int[][] ops) {
        int minA = m;
        int minB = n;
        for (int i=0; i<ops.length; i++) {
            minA = Math.min(minA, ops[i][0]);
            minB = Math.min(minB, ops[i][1]);
        }
        
        return minA * minB;
    }
}

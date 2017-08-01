package set1;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i : prices) {
            res = Math.max(res, i-min);
            min = Math.min(min, i);
        }
        return res;
    }
}
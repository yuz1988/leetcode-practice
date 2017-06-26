package set1;
public class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices.length<=1) {
            return 0;
        }
        
        int buy = prices[0];;
        int maxP = 0;
        // left to right scan
        for (int i=1; i<prices.length; i++) {
            if (prices[i]<buy) {
                buy = prices[i];
            }
            else if (prices[i]-buy>maxP) {
                maxP = prices[i]-buy;
            }
        }
        return maxP;
    }
}
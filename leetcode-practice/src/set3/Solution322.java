package set3;

public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) {
            return 0;
        }
        int[] counts = new int[amount];
        return helper(coins, amount, counts);
    }
    
    private int helper(int[] coins, int amount, int[] counts) {
        if (counts[amount-1] != 0) {
            return counts[amount-1];
        }
        
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (amount == coin) {
                return 1;
            }
            else if (amount > coin)  {
                int num = helper(coins, amount-coin, counts);
                if (num!=-1 && num < min) {
                    min = num;
                }
            }
        }
        
        int res = (min==Integer.MAX_VALUE)?-1:(1+min);
        counts[amount-1] = res;
        return res;
    }
}
package set0;

public class Solution91 {
    public int numDecodings(String s) {
        if (s==null || s.length()==0) {
            return 0;
        }
        // dp state
        int[] dp = new int[s.length()];
        int n = s.charAt(0) - '0';
        if (n >= 1 && n <= 9) {
            dp[0] = 1;
        }
        for (int i=1; i<s.length(); i++) { 
            int n1 = s.charAt(i-1) - '0';
            int n2 = s.charAt(i) - '0';
            if (n2 >= 1 && n2 <= 9) {
                dp[i] = dp[i-1];
            }
            if ((n1 == 1) || (n1 == 2 && n2 <= 6)) {
                if (i == 1) {
                    dp[i]++;
                }
                else {
                    dp[i] += dp[i-2];
                }           
            }
        }
        return dp[s.length()-1];
    }
}

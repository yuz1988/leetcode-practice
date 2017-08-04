package set4;

public class Solution467 {
    public int findSubstringInWraproundString(String p) {
        if (p==null || p.length()==0) {
            return 0;
        }
        
        int count = 0;
        // max length of string ends with each letter
        int[] dp = new int[26];
        for (int i=0; i<p.length(); i++) {
            char c = p.charAt(i);
            if ((i > 0) && ((c - p.charAt(i-1) == 1) || (p.charAt(i-1) == 'z' && c == 'a'))) {
                count++;
            }
            else {
                count = 1;
            }
            dp[c - 'a'] = Math.max(dp[c - 'a'], count);
        }
        
        int res = 0;
        for (int i=0; i<26; i++) {
            res += dp[i];
        }
        return res;
    }
}

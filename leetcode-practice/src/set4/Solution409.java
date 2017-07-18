package set4;

public class Solution409 {
    public int longestPalindrome(String s) {
        if (s==null || s.length()==0) {
            return 0;
        }
        
        int[] map = new int[52];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c-'a'>=0 && c-'a'<=25) {
                map[c-'a']++;
            }
            else {
                map[c-'A'+26]++;
            }
        }
        
        int res = 0;
        boolean oddExist = false;
        for (int i : map) {
            if (i % 2 == 0) {
                res += i;
            }
            else {
                res += i-1;
                oddExist = true;
            }
        }
        
        return oddExist?(res+1):res;
    }
}
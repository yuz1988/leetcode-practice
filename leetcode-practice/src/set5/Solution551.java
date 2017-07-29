package set5;

public class Solution551 {
    public boolean checkRecord(String s) {
        if (s==null || s.length()==0) {
            return true;
        }
        
        int i = 0;
        boolean absent = false;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == 'A') {
                if (absent) {
                    return false;
                }
                else {
                    absent = true;
                }
            }
            if ((c == 'L') && (i > 1) && (s.charAt(i-1) == 'L') && (s.charAt(i-2) == 'L')) {
                return false;
            }
            i++;
        }
        return true;
    }
}

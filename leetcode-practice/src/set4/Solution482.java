package set4;

public class Solution482 {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i=S.length()-1; i>=0; i--) {
            char c = S.charAt(i);
            if (c == '-') {
                continue;
            }
            if (count == K) {
                sb.append('-');
                count = 0;
            }
            if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a') + 'A');
            }
            sb.append(c);
            count++;
        }
        
        return sb.reverse().toString();
    }
}

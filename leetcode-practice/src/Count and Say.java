public class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for (int i=2; i<=n; i++) {
            str = nextNumber(str);
        }
        return str;
    }
    
    // given a number, output the next number
    private String nextNumber(String str) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char c = str.charAt(0);
        for (int i=1; i<str.length(); i++) {
            char c1 = str.charAt(i);
            if (c1!=c) {
                sb.append(""+counter+c);
                counter = 1;
                c = c1;
            }
            else {
                counter++;
            }
        }
        sb.append(""+counter+c);
        return sb.toString();
    }
}
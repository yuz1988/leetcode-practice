package set4;

public class Solution405 {
    public String toHex(int num) {
        if (num==0) {
            return "0";
        }
        
        String res = "";
        while (num != 0) {
            int digit = num & 15;
            int temp;
            if (digit < 10) {
                temp  = digit + '0';
            }
            else {
                temp = digit - 10 + 'a';
            }
            char c = (char) temp;
            res = c + res;
            num = num >>> 4;
        }
        return res;
    }
}

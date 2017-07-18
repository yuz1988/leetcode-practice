package set5;

public class Solution504 {
	public String convertToBase7(int num) {
        String sign = "";
        if (num < 0) {
            sign = "-";
            num = Math.abs(num);
        }
        else if (num == 0) {
            return "0";
        }
        
        String res = "";
        while (num != 0) {
            res = num%7 + res;
            num = num / 7;
        }
        return sign+res;
    }
}

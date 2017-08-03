package set5;

public class Solution537 {
    public String complexNumberMultiply(String a, String b) {
        int[] x = parse(a);
        int[] y = parse(b);
        int real = x[0] * y[0] - x[1] * y[1];
        int complex = x[0] * y[1] + x[1] * y[0];
        return ("" + real + "+" + complex + "i");
    }
    
    private int[] parse(String s) {
        String[] tokens = s.split("\\+");
        int[] res = new int[2];
        res[0] = Integer.parseInt(tokens[0]);
        res[1] = Integer.parseInt(tokens[1].substring(0, tokens[1].length()-1));
        return res;
    }
}
